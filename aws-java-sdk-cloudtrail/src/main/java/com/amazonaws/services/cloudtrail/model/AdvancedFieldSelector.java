/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single selector statement in an advanced event selector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/AdvancedFieldSelector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedFieldSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A field in an event record on which to filter events to be logged. Supported fields include <code>readOnly</code>, <code>eventCategory</code>, <code>eventSource</code> (for management events), <code>eventName</code>,
     * <code>resources.type</code>, and <code>resources.ARN</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code> or
     * <code>false</code>. A value of <code>false</code> logs both <code>read</code> and <code>write</code> events.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventSource</code> </b> - For filtering management events only. This can be set only to
     * <code>NotEquals</code> <code>kms.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data event
     * logged to CloudTrail, such as <code>PutBucket</code>. You can have multiple values for this ﬁeld, separated by
     * commas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventCategory</code> </b> - This is required. It must be set to <code>Equals</code>, and the value must
     * be <code>Management</code> or <code>Data</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.type</code> </b> - This ﬁeld is required. <code>resources.type</code> can only use the
     * <code>Equals</code> operator, and the value can be one of the following: <code>AWS::S3::Object</code> or
     * <code>AWS::Lambda::Function</code>. You can have only one <code>resources.type</code> ﬁeld per selector. To log
     * data events on more than one resource type, add another selector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.ARN</code> </b> - You can use any operator with resources.ARN, but if you use
     * <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource of the
     * type you've speciﬁed in the template as the value of resources.type. For example, if resources.type equals
     * <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. The trailing slash is intentional;
     * do not exclude it.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:partition:s3:::bucket_name/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:partition:s3:::bucket_name/object_or_file_name/</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:partition:lambda:region:account_ID:function:function_name</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String field;
    /**
     * <p>
     * An operator that includes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>. This is the only valid operator that you can use with the <code>readOnly</code>,
     * <code>eventCategory</code>, and <code>resources.type</code> fields.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> equals;
    /**
     * <p>
     * An operator that includes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> startsWith;
    /**
     * <p>
     * An operator that includes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> endsWith;
    /**
     * <p>
     * An operator that excludes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notEquals;
    /**
     * <p>
     * An operator that excludes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notStartsWith;
    /**
     * <p>
     * An operator that excludes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notEndsWith;

    /**
     * <p>
     * A field in an event record on which to filter events to be logged. Supported fields include <code>readOnly</code>, <code>eventCategory</code>, <code>eventSource</code> (for management events), <code>eventName</code>,
     * <code>resources.type</code>, and <code>resources.ARN</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code> or
     * <code>false</code>. A value of <code>false</code> logs both <code>read</code> and <code>write</code> events.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventSource</code> </b> - For filtering management events only. This can be set only to
     * <code>NotEquals</code> <code>kms.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data event
     * logged to CloudTrail, such as <code>PutBucket</code>. You can have multiple values for this ﬁeld, separated by
     * commas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventCategory</code> </b> - This is required. It must be set to <code>Equals</code>, and the value must
     * be <code>Management</code> or <code>Data</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.type</code> </b> - This ﬁeld is required. <code>resources.type</code> can only use the
     * <code>Equals</code> operator, and the value can be one of the following: <code>AWS::S3::Object</code> or
     * <code>AWS::Lambda::Function</code>. You can have only one <code>resources.type</code> ﬁeld per selector. To log
     * data events on more than one resource type, add another selector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.ARN</code> </b> - You can use any operator with resources.ARN, but if you use
     * <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource of the
     * type you've speciﬁed in the template as the value of resources.type. For example, if resources.type equals
     * <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. The trailing slash is intentional;
     * do not exclude it.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:partition:s3:::bucket_name/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:partition:s3:::bucket_name/object_or_file_name/</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:partition:lambda:region:account_ID:function:function_name</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param field
     *        A field in an event record on which to filter events to be logged. Supported fields include
     *        <code>readOnly</code>, <code>eventCategory</code>, <code>eventSource</code> (for management events),
     *        <code>eventName</code>, <code>resources.type</code>, and <code>resources.ARN</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code>
     *        or <code>false</code>. A value of <code>false</code> logs both <code>read</code> and <code>write</code>
     *        events.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventSource</code> </b> - For filtering management events only. This can be set only to
     *        <code>NotEquals</code> <code>kms.amazonaws.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
     *        event logged to CloudTrail, such as <code>PutBucket</code>. You can have multiple values for this ﬁeld,
     *        separated by commas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventCategory</code> </b> - This is required. It must be set to <code>Equals</code>, and the
     *        value must be <code>Management</code> or <code>Data</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>resources.type</code> </b> - This ﬁeld is required. <code>resources.type</code> can only use the
     *        <code>Equals</code> operator, and the value can be one of the following: <code>AWS::S3::Object</code> or
     *        <code>AWS::Lambda::Function</code>. You can have only one <code>resources.type</code> ﬁeld per selector.
     *        To log data events on more than one resource type, add another selector.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>resources.ARN</code> </b> - You can use any operator with resources.ARN, but if you use
     *        <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource of
     *        the type you've speciﬁed in the template as the value of resources.type. For example, if resources.type
     *        equals <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. The trailing slash
     *        is intentional; do not exclude it.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:partition:s3:::bucket_name/</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:partition:s3:::bucket_name/object_or_file_name/</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:partition:lambda:region:account_ID:function:function_name</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * A field in an event record on which to filter events to be logged. Supported fields include <code>readOnly</code>, <code>eventCategory</code>, <code>eventSource</code> (for management events), <code>eventName</code>,
     * <code>resources.type</code>, and <code>resources.ARN</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code> or
     * <code>false</code>. A value of <code>false</code> logs both <code>read</code> and <code>write</code> events.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventSource</code> </b> - For filtering management events only. This can be set only to
     * <code>NotEquals</code> <code>kms.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data event
     * logged to CloudTrail, such as <code>PutBucket</code>. You can have multiple values for this ﬁeld, separated by
     * commas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventCategory</code> </b> - This is required. It must be set to <code>Equals</code>, and the value must
     * be <code>Management</code> or <code>Data</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.type</code> </b> - This ﬁeld is required. <code>resources.type</code> can only use the
     * <code>Equals</code> operator, and the value can be one of the following: <code>AWS::S3::Object</code> or
     * <code>AWS::Lambda::Function</code>. You can have only one <code>resources.type</code> ﬁeld per selector. To log
     * data events on more than one resource type, add another selector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.ARN</code> </b> - You can use any operator with resources.ARN, but if you use
     * <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource of the
     * type you've speciﬁed in the template as the value of resources.type. For example, if resources.type equals
     * <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. The trailing slash is intentional;
     * do not exclude it.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:partition:s3:::bucket_name/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:partition:s3:::bucket_name/object_or_file_name/</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:partition:lambda:region:account_ID:function:function_name</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return A field in an event record on which to filter events to be logged. Supported fields include
     *         <code>readOnly</code>, <code>eventCategory</code>, <code>eventSource</code> (for management events),
     *         <code>eventName</code>, <code>resources.type</code>, and <code>resources.ARN</code>. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code>
     *         or <code>false</code>. A value of <code>false</code> logs both <code>read</code> and <code>write</code>
     *         events.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>eventSource</code> </b> - For filtering management events only. This can be set only to
     *         <code>NotEquals</code> <code>kms.amazonaws.com</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
     *         event logged to CloudTrail, such as <code>PutBucket</code>. You can have multiple values for this ﬁeld,
     *         separated by commas.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>eventCategory</code> </b> - This is required. It must be set to <code>Equals</code>, and the
     *         value must be <code>Management</code> or <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>resources.type</code> </b> - This ﬁeld is required. <code>resources.type</code> can only use
     *         the <code>Equals</code> operator, and the value can be one of the following: <code>AWS::S3::Object</code>
     *         or <code>AWS::Lambda::Function</code>. You can have only one <code>resources.type</code> ﬁeld per
     *         selector. To log data events on more than one resource type, add another selector.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>resources.ARN</code> </b> - You can use any operator with resources.ARN, but if you use
     *         <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource
     *         of the type you've speciﬁed in the template as the value of resources.type. For example, if
     *         resources.type equals <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. The
     *         trailing slash is intentional; do not exclude it.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:partition:s3:::bucket_name/</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:partition:s3:::bucket_name/object_or_file_name/</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:partition:lambda:region:account_ID:function:function_name</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * A field in an event record on which to filter events to be logged. Supported fields include <code>readOnly</code>, <code>eventCategory</code>, <code>eventSource</code> (for management events), <code>eventName</code>,
     * <code>resources.type</code>, and <code>resources.ARN</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code> or
     * <code>false</code>. A value of <code>false</code> logs both <code>read</code> and <code>write</code> events.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventSource</code> </b> - For filtering management events only. This can be set only to
     * <code>NotEquals</code> <code>kms.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data event
     * logged to CloudTrail, such as <code>PutBucket</code>. You can have multiple values for this ﬁeld, separated by
     * commas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventCategory</code> </b> - This is required. It must be set to <code>Equals</code>, and the value must
     * be <code>Management</code> or <code>Data</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.type</code> </b> - This ﬁeld is required. <code>resources.type</code> can only use the
     * <code>Equals</code> operator, and the value can be one of the following: <code>AWS::S3::Object</code> or
     * <code>AWS::Lambda::Function</code>. You can have only one <code>resources.type</code> ﬁeld per selector. To log
     * data events on more than one resource type, add another selector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.ARN</code> </b> - You can use any operator with resources.ARN, but if you use
     * <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource of the
     * type you've speciﬁed in the template as the value of resources.type. For example, if resources.type equals
     * <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. The trailing slash is intentional;
     * do not exclude it.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:partition:s3:::bucket_name/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:partition:s3:::bucket_name/object_or_file_name/</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:partition:lambda:region:account_ID:function:function_name</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param field
     *        A field in an event record on which to filter events to be logged. Supported fields include
     *        <code>readOnly</code>, <code>eventCategory</code>, <code>eventSource</code> (for management events),
     *        <code>eventName</code>, <code>resources.type</code>, and <code>resources.ARN</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code>
     *        or <code>false</code>. A value of <code>false</code> logs both <code>read</code> and <code>write</code>
     *        events.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventSource</code> </b> - For filtering management events only. This can be set only to
     *        <code>NotEquals</code> <code>kms.amazonaws.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
     *        event logged to CloudTrail, such as <code>PutBucket</code>. You can have multiple values for this ﬁeld,
     *        separated by commas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventCategory</code> </b> - This is required. It must be set to <code>Equals</code>, and the
     *        value must be <code>Management</code> or <code>Data</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>resources.type</code> </b> - This ﬁeld is required. <code>resources.type</code> can only use the
     *        <code>Equals</code> operator, and the value can be one of the following: <code>AWS::S3::Object</code> or
     *        <code>AWS::Lambda::Function</code>. You can have only one <code>resources.type</code> ﬁeld per selector.
     *        To log data events on more than one resource type, add another selector.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>resources.ARN</code> </b> - You can use any operator with resources.ARN, but if you use
     *        <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource of
     *        the type you've speciﬁed in the template as the value of resources.type. For example, if resources.type
     *        equals <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. The trailing slash
     *        is intentional; do not exclude it.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:partition:s3:::bucket_name/</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:partition:s3:::bucket_name/object_or_file_name/</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:partition:lambda:region:account_ID:function:function_name</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>. This is the only valid operator that you can use with the <code>readOnly</code>,
     * <code>eventCategory</code>, and <code>resources.type</code> fields.
     * </p>
     * 
     * @return An operator that includes events that match the exact value of the event record field specified as the
     *         value of <code>Field</code>. This is the only valid operator that you can use with the
     *         <code>readOnly</code>, <code>eventCategory</code>, and <code>resources.type</code> fields.
     */

    public java.util.List<String> getEquals() {
        if (equals == null) {
            equals = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return equals;
    }

    /**
     * <p>
     * An operator that includes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>. This is the only valid operator that you can use with the <code>readOnly</code>,
     * <code>eventCategory</code>, and <code>resources.type</code> fields.
     * </p>
     * 
     * @param equals
     *        An operator that includes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>. This is the only valid operator that you can use with the
     *        <code>readOnly</code>, <code>eventCategory</code>, and <code>resources.type</code> fields.
     */

    public void setEquals(java.util.Collection<String> equals) {
        if (equals == null) {
            this.equals = null;
            return;
        }

        this.equals = new com.amazonaws.internal.SdkInternalList<String>(equals);
    }

    /**
     * <p>
     * An operator that includes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>. This is the only valid operator that you can use with the <code>readOnly</code>,
     * <code>eventCategory</code>, and <code>resources.type</code> fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEquals(java.util.Collection)} or {@link #withEquals(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param equals
     *        An operator that includes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>. This is the only valid operator that you can use with the
     *        <code>readOnly</code>, <code>eventCategory</code>, and <code>resources.type</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEquals(String... equals) {
        if (this.equals == null) {
            setEquals(new com.amazonaws.internal.SdkInternalList<String>(equals.length));
        }
        for (String ele : equals) {
            this.equals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>. This is the only valid operator that you can use with the <code>readOnly</code>,
     * <code>eventCategory</code>, and <code>resources.type</code> fields.
     * </p>
     * 
     * @param equals
     *        An operator that includes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>. This is the only valid operator that you can use with the
     *        <code>readOnly</code>, <code>eventCategory</code>, and <code>resources.type</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEquals(java.util.Collection<String> equals) {
        setEquals(equals);
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @return An operator that includes events that match the first few characters of the event record field specified
     *         as the value of <code>Field</code>.
     */

    public java.util.List<String> getStartsWith() {
        if (startsWith == null) {
            startsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return startsWith;
    }

    /**
     * <p>
     * An operator that includes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param startsWith
     *        An operator that includes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     */

    public void setStartsWith(java.util.Collection<String> startsWith) {
        if (startsWith == null) {
            this.startsWith = null;
            return;
        }

        this.startsWith = new com.amazonaws.internal.SdkInternalList<String>(startsWith);
    }

    /**
     * <p>
     * An operator that includes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStartsWith(java.util.Collection)} or {@link #withStartsWith(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param startsWith
     *        An operator that includes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withStartsWith(String... startsWith) {
        if (this.startsWith == null) {
            setStartsWith(new com.amazonaws.internal.SdkInternalList<String>(startsWith.length));
        }
        for (String ele : startsWith) {
            this.startsWith.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param startsWith
     *        An operator that includes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withStartsWith(java.util.Collection<String> startsWith) {
        setStartsWith(startsWith);
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @return An operator that includes events that match the last few characters of the event record field specified
     *         as the value of <code>Field</code>.
     */

    public java.util.List<String> getEndsWith() {
        if (endsWith == null) {
            endsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return endsWith;
    }

    /**
     * <p>
     * An operator that includes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param endsWith
     *        An operator that includes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     */

    public void setEndsWith(java.util.Collection<String> endsWith) {
        if (endsWith == null) {
            this.endsWith = null;
            return;
        }

        this.endsWith = new com.amazonaws.internal.SdkInternalList<String>(endsWith);
    }

    /**
     * <p>
     * An operator that includes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndsWith(java.util.Collection)} or {@link #withEndsWith(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param endsWith
     *        An operator that includes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEndsWith(String... endsWith) {
        if (this.endsWith == null) {
            setEndsWith(new com.amazonaws.internal.SdkInternalList<String>(endsWith.length));
        }
        for (String ele : endsWith) {
            this.endsWith.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param endsWith
     *        An operator that includes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEndsWith(java.util.Collection<String> endsWith) {
        setEndsWith(endsWith);
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>.
     * </p>
     * 
     * @return An operator that excludes events that match the exact value of the event record field specified as the
     *         value of <code>Field</code>.
     */

    public java.util.List<String> getNotEquals() {
        if (notEquals == null) {
            notEquals = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notEquals;
    }

    /**
     * <p>
     * An operator that excludes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>.
     * </p>
     * 
     * @param notEquals
     *        An operator that excludes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>.
     */

    public void setNotEquals(java.util.Collection<String> notEquals) {
        if (notEquals == null) {
            this.notEquals = null;
            return;
        }

        this.notEquals = new com.amazonaws.internal.SdkInternalList<String>(notEquals);
    }

    /**
     * <p>
     * An operator that excludes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotEquals(java.util.Collection)} or {@link #withNotEquals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notEquals
     *        An operator that excludes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEquals(String... notEquals) {
        if (this.notEquals == null) {
            setNotEquals(new com.amazonaws.internal.SdkInternalList<String>(notEquals.length));
        }
        for (String ele : notEquals) {
            this.notEquals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>.
     * </p>
     * 
     * @param notEquals
     *        An operator that excludes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEquals(java.util.Collection<String> notEquals) {
        setNotEquals(notEquals);
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @return An operator that excludes events that match the first few characters of the event record field specified
     *         as the value of <code>Field</code>.
     */

    public java.util.List<String> getNotStartsWith() {
        if (notStartsWith == null) {
            notStartsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notStartsWith;
    }

    /**
     * <p>
     * An operator that excludes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param notStartsWith
     *        An operator that excludes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     */

    public void setNotStartsWith(java.util.Collection<String> notStartsWith) {
        if (notStartsWith == null) {
            this.notStartsWith = null;
            return;
        }

        this.notStartsWith = new com.amazonaws.internal.SdkInternalList<String>(notStartsWith);
    }

    /**
     * <p>
     * An operator that excludes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotStartsWith(java.util.Collection)} or {@link #withNotStartsWith(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param notStartsWith
     *        An operator that excludes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotStartsWith(String... notStartsWith) {
        if (this.notStartsWith == null) {
            setNotStartsWith(new com.amazonaws.internal.SdkInternalList<String>(notStartsWith.length));
        }
        for (String ele : notStartsWith) {
            this.notStartsWith.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param notStartsWith
     *        An operator that excludes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotStartsWith(java.util.Collection<String> notStartsWith) {
        setNotStartsWith(notStartsWith);
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @return An operator that excludes events that match the last few characters of the event record field specified
     *         as the value of <code>Field</code>.
     */

    public java.util.List<String> getNotEndsWith() {
        if (notEndsWith == null) {
            notEndsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notEndsWith;
    }

    /**
     * <p>
     * An operator that excludes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param notEndsWith
     *        An operator that excludes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     */

    public void setNotEndsWith(java.util.Collection<String> notEndsWith) {
        if (notEndsWith == null) {
            this.notEndsWith = null;
            return;
        }

        this.notEndsWith = new com.amazonaws.internal.SdkInternalList<String>(notEndsWith);
    }

    /**
     * <p>
     * An operator that excludes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotEndsWith(java.util.Collection)} or {@link #withNotEndsWith(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notEndsWith
     *        An operator that excludes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEndsWith(String... notEndsWith) {
        if (this.notEndsWith == null) {
            setNotEndsWith(new com.amazonaws.internal.SdkInternalList<String>(notEndsWith.length));
        }
        for (String ele : notEndsWith) {
            this.notEndsWith.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param notEndsWith
     *        An operator that excludes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEndsWith(java.util.Collection<String> notEndsWith) {
        setNotEndsWith(notEndsWith);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getEquals() != null)
            sb.append("Equals: ").append(getEquals()).append(",");
        if (getStartsWith() != null)
            sb.append("StartsWith: ").append(getStartsWith()).append(",");
        if (getEndsWith() != null)
            sb.append("EndsWith: ").append(getEndsWith()).append(",");
        if (getNotEquals() != null)
            sb.append("NotEquals: ").append(getNotEquals()).append(",");
        if (getNotStartsWith() != null)
            sb.append("NotStartsWith: ").append(getNotStartsWith()).append(",");
        if (getNotEndsWith() != null)
            sb.append("NotEndsWith: ").append(getNotEndsWith());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedFieldSelector == false)
            return false;
        AdvancedFieldSelector other = (AdvancedFieldSelector) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getEquals() == null ^ this.getEquals() == null)
            return false;
        if (other.getEquals() != null && other.getEquals().equals(this.getEquals()) == false)
            return false;
        if (other.getStartsWith() == null ^ this.getStartsWith() == null)
            return false;
        if (other.getStartsWith() != null && other.getStartsWith().equals(this.getStartsWith()) == false)
            return false;
        if (other.getEndsWith() == null ^ this.getEndsWith() == null)
            return false;
        if (other.getEndsWith() != null && other.getEndsWith().equals(this.getEndsWith()) == false)
            return false;
        if (other.getNotEquals() == null ^ this.getNotEquals() == null)
            return false;
        if (other.getNotEquals() != null && other.getNotEquals().equals(this.getNotEquals()) == false)
            return false;
        if (other.getNotStartsWith() == null ^ this.getNotStartsWith() == null)
            return false;
        if (other.getNotStartsWith() != null && other.getNotStartsWith().equals(this.getNotStartsWith()) == false)
            return false;
        if (other.getNotEndsWith() == null ^ this.getNotEndsWith() == null)
            return false;
        if (other.getNotEndsWith() != null && other.getNotEndsWith().equals(this.getNotEndsWith()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getEquals() == null) ? 0 : getEquals().hashCode());
        hashCode = prime * hashCode + ((getStartsWith() == null) ? 0 : getStartsWith().hashCode());
        hashCode = prime * hashCode + ((getEndsWith() == null) ? 0 : getEndsWith().hashCode());
        hashCode = prime * hashCode + ((getNotEquals() == null) ? 0 : getNotEquals().hashCode());
        hashCode = prime * hashCode + ((getNotStartsWith() == null) ? 0 : getNotStartsWith().hashCode());
        hashCode = prime * hashCode + ((getNotEndsWith() == null) ? 0 : getNotEndsWith().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedFieldSelector clone() {
        try {
            return (AdvancedFieldSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.AdvancedFieldSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
