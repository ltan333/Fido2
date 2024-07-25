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

import java.util.Arrays;

public enum SecurityLevel {
    SOFTWARE(0), TRUSTED_ENVIRONMENT(1);

    private final int value;

    SecurityLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static SecurityLevel fromValue(int value) {
        return Arrays.stream(SecurityLevel.values())
                .filter(e -> e.value == value)
                .findFirst()
                .get();
    }
}
