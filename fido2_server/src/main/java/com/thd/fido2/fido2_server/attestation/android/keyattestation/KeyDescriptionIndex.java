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

package com.thd.fido2.fido2_server.attestation.android.keyattestation;

public class KeyDescriptionIndex {
    public static final int ATTESTATION_VERSION_INDEX = 0;
    public static final int ATTESTATION_SECURITY_LEVEL_INDEX = 1;
    public static final int KEYMASTER_VERSION_INDEX = 2;
    public static final int KEYMASTER_SECURITY_LEVEL_INDEX = 3;
    public static final int ATTESTATION_CHALLENGE_INDEX = 4;
    public static final int SW_ENFORCED_INDEX = 6;
    public static final int TEE_ENFORCED_INDEX = 7;
}
