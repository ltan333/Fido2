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

package com.thd.fido2.fido2_server.attestation.tpm;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ObjectAttributes {
    private boolean fixedTpm;
    private boolean stClear;
    private boolean fixedParent;
    private boolean sensitiveDataOrigin;
    private boolean userWithAuth;
    private boolean adminWithPolicy;
    private boolean noDA;
    private boolean encryptedDuplication;
    private boolean restricted;
    private boolean decrypt;
    private boolean signEncrypt;
}
