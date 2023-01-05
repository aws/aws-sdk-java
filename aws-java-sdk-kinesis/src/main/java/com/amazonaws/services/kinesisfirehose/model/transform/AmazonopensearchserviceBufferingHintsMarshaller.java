/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisfirehose.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AmazonopensearchserviceBufferingHintsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AmazonopensearchserviceBufferingHintsMarshaller {

    private static final MarshallingInfo<Integer> INTERVALINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntervalInSeconds").build();
    private static final MarshallingInfo<Integer> SIZEINMBS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SizeInMBs").build();

    private static final AmazonopensearchserviceBufferingHintsMarshaller instance = new AmazonopensearchserviceBufferingHintsMarshaller();

    public static AmazonopensearchserviceBufferingHintsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AmazonopensearchserviceBufferingHints amazonopensearchserviceBufferingHints, ProtocolMarshaller protocolMarshaller) {

        if (amazonopensearchserviceBufferingHints == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(amazonopensearchserviceBufferingHints.getIntervalInSeconds(), INTERVALINSECONDS_BINDING);
            protocolMarshaller.marshall(amazonopensearchserviceBufferingHints.getSizeInMBs(), SIZEINMBS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
