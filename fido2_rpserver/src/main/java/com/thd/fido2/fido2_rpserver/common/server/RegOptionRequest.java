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

package com.thd.fido2.fido2_rpserver.common.server;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.thd.fido2.fido2_rpserver.common.AttestationConveyancePreference;
import com.thd.fido2.fido2_rpserver.common.AuthenticatorSelectionCriteria;
import com.thd.fido2.fido2_rpserver.common.PublicKeyCredentialRpEntity;
import com.thd.fido2.fido2_rpserver.common.extension.CredProtect;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegOptionRequest {
    @NotNull
    private PublicKeyCredentialRpEntity rp;
    @NotNull
    @Valid
    private ServerPublicKeyCredentialUserEntity user;
    private AuthenticatorSelectionCriteria authenticatorSelection;
    private AttestationConveyancePreference attestation;
    private CredProtect credProtect;
}
