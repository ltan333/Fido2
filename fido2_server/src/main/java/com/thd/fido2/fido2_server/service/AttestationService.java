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

package com.thd.fido2.fido2_server.service;

import com.thd.fido2.fido2_server.common.AuthenticatorSelectionCriteria;
import com.thd.fido2.fido2_server.common.server.ServerAuthenticatorAttestationResponse;
import com.thd.fido2.fido2_server.attestation.AttestationVerificationResult;
import com.thd.fido2.fido2_server.model.AttestationObject;

public interface AttestationService {
    AttestationVerificationResult verifyAttestation(byte[] clientDataHsh, AttestationObject attestationObject);
    AttestationObject getAttestationObject(ServerAuthenticatorAttestationResponse attestationResponse);
    void attestationObjectValidationCheck(String rpId, AuthenticatorSelectionCriteria authenticatorSelection, AttestationObject attestationObject);
    void verifyAttestationCertificate(AttestationObject attestationObject, AttestationVerificationResult attestationVerificationResult);
}