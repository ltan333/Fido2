/*
 * Copyright 2021 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.thd.fido2.fido2_server.helper;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;

import com.thd.fido2.fido2_server.attestation.android.keyattestation.AndroidKeyAttestationStatement;
import com.thd.fido2.fido2_server.attestation.android.safetynet.AndroidSafetyNetAttestationStatement;
import com.thd.fido2.fido2_server.attestation.none.NoneAttestationStatementFormat;
import com.thd.fido2.fido2_server.attestation.packed.PackedAttestationStatement;
import com.thd.fido2.fido2_server.attestation.tpm.TpmAttestationStatement;
import com.thd.fido2.fido2_server.attestation.u2f.FidoU2fAttestationStatement;
import com.thd.fido2.fido2_server.model.AttestationStatement;
import com.thd.fido2.fido2_server.model.AttestationStatementFormatIdentifier;

public class AttestationStatementHelper {
    public static AttestationStatement decode(byte[] input, AttestationStatementFormatIdentifier identifier) throws IOException {
        CBORFactory cborFactory = new CBORFactory();
        ObjectMapper objectMapper = new ObjectMapper(cborFactory);
        if (identifier == AttestationStatementFormatIdentifier.PACKED) {
            return objectMapper.readValue(input, PackedAttestationStatement.class);
        } else if (identifier == AttestationStatementFormatIdentifier.TPM) {
            return objectMapper.readValue(input, TpmAttestationStatement.class);
        } else if (identifier == AttestationStatementFormatIdentifier.ANDROID_KEY) {
            return objectMapper.readValue(input, AndroidKeyAttestationStatement.class);
        } else if (identifier == AttestationStatementFormatIdentifier.ANDROID_SAFETYNET) {
            return objectMapper.readValue(input, AndroidSafetyNetAttestationStatement.class);
        } else if (identifier == AttestationStatementFormatIdentifier.FIDO_U2F) {
            return objectMapper.readValue(input, FidoU2fAttestationStatement.class);
        } else {
            return objectMapper.readValue(input, NoneAttestationStatementFormat.class);
        }
    }

    public static byte[] encode(AttestationStatement attestationStatement) throws IOException {
        CBORFactory cborFactory = new CBORFactory();
        ObjectMapper objectMapper = new ObjectMapper(cborFactory);
        return objectMapper.writeValueAsBytes(attestationStatement);
    }
}
