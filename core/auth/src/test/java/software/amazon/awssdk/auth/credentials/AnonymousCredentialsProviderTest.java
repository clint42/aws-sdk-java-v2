/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.auth.credentials;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AnonymousCredentialsProviderTest {

    @Test
    void resolveCredentials_returnsAnonymousCredentials()  {
        AwsCredentials credentials = AnonymousCredentialsProvider.create().resolveCredentials();
        assertThat(credentials.accessKeyId()).isNull();
        assertThat(credentials.secretAccessKey()).isNull();
        assertThat(credentials.providerName()).isPresent().contains("AnonymousCredentialsProvider");
    }
}
