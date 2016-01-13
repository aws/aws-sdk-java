/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.iot.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ActionMarshaller
 */
public class ActionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Action action, JSONWriter jsonWriter) {
        if (action == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (action.getDynamoDB() != null) {
                jsonWriter.key("dynamoDB");
                DynamoDBActionJsonMarshaller.getInstance().marshall(
                        action.getDynamoDB(), jsonWriter);
            }

            if (action.getLambda() != null) {
                jsonWriter.key("lambda");
                LambdaActionJsonMarshaller.getInstance().marshall(
                        action.getLambda(), jsonWriter);
            }

            if (action.getSns() != null) {
                jsonWriter.key("sns");
                SnsActionJsonMarshaller.getInstance().marshall(action.getSns(),
                        jsonWriter);
            }

            if (action.getSqs() != null) {
                jsonWriter.key("sqs");
                SqsActionJsonMarshaller.getInstance().marshall(action.getSqs(),
                        jsonWriter);
            }

            if (action.getKinesis() != null) {
                jsonWriter.key("kinesis");
                KinesisActionJsonMarshaller.getInstance().marshall(
                        action.getKinesis(), jsonWriter);
            }

            if (action.getRepublish() != null) {
                jsonWriter.key("republish");
                RepublishActionJsonMarshaller.getInstance().marshall(
                        action.getRepublish(), jsonWriter);
            }

            if (action.getS3() != null) {
                jsonWriter.key("s3");
                S3ActionJsonMarshaller.getInstance().marshall(action.getS3(),
                        jsonWriter);
            }

            if (action.getFirehose() != null) {
                jsonWriter.key("firehose");
                FirehoseActionJsonMarshaller.getInstance().marshall(
                        action.getFirehose(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActionJsonMarshaller instance;

    public static ActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionJsonMarshaller();
        return instance;
    }

}
