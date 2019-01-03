/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Amazon S3 buckets or AWS Lambda functions that you specify in your event selectors for your trail to log data
 * events. Data events provide insight into the resource operations performed on or within a resource itself. These are
 * also known as data plane operations. You can specify up to 250 data resources for a trail.
 * </p>
 * <note>
 * <p>
 * The total number of allowed data resources is 250. This number can be distributed between 1 and 5 event selectors,
 * but the total cannot exceed 250 across all selectors.
 * </p>
 * </note>
 * <p>
 * The following example demonstrates how logging works when you configure logging of all data events for an S3 bucket
 * named <code>bucket-1</code>. In this example, the CloudTrail user spcified an empty prefix, and the option to log
 * both <code>Read</code> and <code>Write</code> data events.
 * </p>
 * <ol>
 * <li>
 * <p>
 * A user uploads an image file to <code>bucket-1</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>PutObject</code> API operation is an Amazon S3 object-level API. It is recorded as a data event in
 * CloudTrail. Because the CloudTrail user specified an S3 bucket with an empty prefix, events that occur on any object
 * in that bucket are logged. The trail processes and logs the event.
 * </p>
 * </li>
 * <li>
 * <p>
 * A user uploads an object to an Amazon S3 bucket named <code>arn:aws:s3:::bucket-2</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>PutObject</code> API operation occurred for an object in an S3 bucket that the CloudTrail user didn't
 * specify for the trail. The trail doesn’t log the event.
 * </p>
 * </li>
 * </ol>
 * <p>
 * The following example demonstrates how logging works when you configure logging of AWS Lambda data events for a
 * Lambda function named <i>MyLambdaFunction</i>, but not for all AWS Lambda functions.
 * </p>
 * <ol>
 * <li>
 * <p>
 * A user runs a script that includes a call to the <i>MyLambdaFunction</i> function and the
 * <i>MyOtherLambdaFunction</i> function.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>Invoke</code> API operation on <i>MyLambdaFunction</i> is an AWS Lambda API. It is recorded as a data event
 * in CloudTrail. Because the CloudTrail user specified logging data events for <i>MyLambdaFunction</i>, any invocations
 * of that function are logged. The trail processes and logs the event.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>Invoke</code> API operation on <i>MyOtherLambdaFunction</i> is an AWS Lambda API. Because the CloudTrail
 * user did not specify logging data events for all Lambda functions, the <code>Invoke</code> operation for
 * <i>MyOtherLambdaFunction</i> does not match the function specified for the trail. The trail doesn’t log the event.
 * </p>
 * </li>
 * </ol>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/DataResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource type in which you want to log data events. You can specify <code>AWS::S3::Object</code> or
     * <code>AWS::Lambda::Function</code> resources.
     * </p>
     */
    private String type;
    /**
     * <p>
     * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as
     * <code>arn:aws:s3:::</code>.
     * </p>
     * <note>
     * <p>
     * This will also enable logging of data event activity performed by any user or role in your AWS account, even if
     * that activity is performed on a bucket that belongs to another AWS account.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * To log data events for all objects in all S3 buckets that include <i>my-bucket</i> in their names, specify the
     * prefix as <code>aws:s3:::my-bucket</code>. The trail logs data events for all objects in all buckets whose name
     * contains a match for <i>my-bucket</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     * <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3 bucket that
     * match the prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for all functions in your AWS account, specify the prefix as <code>arn:aws:lambda</code>.
     * </p>
     * <note>
     * <p>
     * This will also enable logging of <code>Invoke</code> activity performed by any user or role in your AWS account,
     * even if that activity is performed on a function that belongs to another AWS account.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * To log data eents for a specific Lambda function, specify the function ARN.
     * </p>
     * <note>
     * <p>
     * Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a function ARN
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>, data events will only be logged for
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>. They will not be logged for
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld2</i>.
     * </p>
     * </note></li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The resource type in which you want to log data events. You can specify <code>AWS::S3::Object</code> or
     * <code>AWS::Lambda::Function</code> resources.
     * </p>
     * 
     * @param type
     *        The resource type in which you want to log data events. You can specify <code>AWS::S3::Object</code> or
     *        <code>AWS::Lambda::Function</code> resources.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The resource type in which you want to log data events. You can specify <code>AWS::S3::Object</code> or
     * <code>AWS::Lambda::Function</code> resources.
     * </p>
     * 
     * @return The resource type in which you want to log data events. You can specify <code>AWS::S3::Object</code> or
     *         <code>AWS::Lambda::Function</code> resources.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The resource type in which you want to log data events. You can specify <code>AWS::S3::Object</code> or
     * <code>AWS::Lambda::Function</code> resources.
     * </p>
     * 
     * @param type
     *        The resource type in which you want to log data events. You can specify <code>AWS::S3::Object</code> or
     *        <code>AWS::Lambda::Function</code> resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataResource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as
     * <code>arn:aws:s3:::</code>.
     * </p>
     * <note>
     * <p>
     * This will also enable logging of data event activity performed by any user or role in your AWS account, even if
     * that activity is performed on a bucket that belongs to another AWS account.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * To log data events for all objects in all S3 buckets that include <i>my-bucket</i> in their names, specify the
     * prefix as <code>aws:s3:::my-bucket</code>. The trail logs data events for all objects in all buckets whose name
     * contains a match for <i>my-bucket</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     * <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3 bucket that
     * match the prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for all functions in your AWS account, specify the prefix as <code>arn:aws:lambda</code>.
     * </p>
     * <note>
     * <p>
     * This will also enable logging of <code>Invoke</code> activity performed by any user or role in your AWS account,
     * even if that activity is performed on a function that belongs to another AWS account.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * To log data eents for a specific Lambda function, specify the function ARN.
     * </p>
     * <note>
     * <p>
     * Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a function ARN
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>, data events will only be logged for
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>. They will not be logged for
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld2</i>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as
     *         <code>arn:aws:s3:::</code>.
     *         </p>
     *         <note>
     *         <p>
     *         This will also enable logging of data event activity performed by any user or role in your AWS account,
     *         even if that activity is performed on a bucket that belongs to another AWS account.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         To log data events for all objects in all S3 buckets that include <i>my-bucket</i> in their names,
     *         specify the prefix as <code>aws:s3:::my-bucket</code>. The trail logs data events for all objects in all
     *         buckets whose name contains a match for <i>my-bucket</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     *         <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To log data events for specific objects, specify the S3 bucket and object prefix such as
     *         <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3
     *         bucket that match the prefix.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To log data events for all functions in your AWS account, specify the prefix as
     *         <code>arn:aws:lambda</code>.
     *         </p>
     *         <note>
     *         <p>
     *         This will also enable logging of <code>Invoke</code> activity performed by any user or role in your AWS
     *         account, even if that activity is performed on a function that belongs to another AWS account.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         To log data eents for a specific Lambda function, specify the function ARN.
     *         </p>
     *         <note>
     *         <p>
     *         Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a
     *         function ARN <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>, data events will only be
     *         logged for <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>. They will not be logged for
     *         <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld2</i>.
     *         </p>
     *         </note></li>
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as
     * <code>arn:aws:s3:::</code>.
     * </p>
     * <note>
     * <p>
     * This will also enable logging of data event activity performed by any user or role in your AWS account, even if
     * that activity is performed on a bucket that belongs to another AWS account.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * To log data events for all objects in all S3 buckets that include <i>my-bucket</i> in their names, specify the
     * prefix as <code>aws:s3:::my-bucket</code>. The trail logs data events for all objects in all buckets whose name
     * contains a match for <i>my-bucket</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     * <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3 bucket that
     * match the prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for all functions in your AWS account, specify the prefix as <code>arn:aws:lambda</code>.
     * </p>
     * <note>
     * <p>
     * This will also enable logging of <code>Invoke</code> activity performed by any user or role in your AWS account,
     * even if that activity is performed on a function that belongs to another AWS account.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * To log data eents for a specific Lambda function, specify the function ARN.
     * </p>
     * <note>
     * <p>
     * Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a function ARN
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>, data events will only be logged for
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>. They will not be logged for
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld2</i>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param values
     *        An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as
     *        <code>arn:aws:s3:::</code>.
     *        </p>
     *        <note>
     *        <p>
     *        This will also enable logging of data event activity performed by any user or role in your AWS account,
     *        even if that activity is performed on a bucket that belongs to another AWS account.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        To log data events for all objects in all S3 buckets that include <i>my-bucket</i> in their names, specify
     *        the prefix as <code>aws:s3:::my-bucket</code>. The trail logs data events for all objects in all buckets
     *        whose name contains a match for <i>my-bucket</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     *        <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To log data events for specific objects, specify the S3 bucket and object prefix such as
     *        <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3
     *        bucket that match the prefix.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To log data events for all functions in your AWS account, specify the prefix as
     *        <code>arn:aws:lambda</code>.
     *        </p>
     *        <note>
     *        <p>
     *        This will also enable logging of <code>Invoke</code> activity performed by any user or role in your AWS
     *        account, even if that activity is performed on a function that belongs to another AWS account.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        To log data eents for a specific Lambda function, specify the function ARN.
     *        </p>
     *        <note>
     *        <p>
     *        Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a function
     *        ARN <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>, data events will only be logged for
     *        <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>. They will not be logged for
     *        <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld2</i>.
     *        </p>
     *        </note></li>
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as
     * <code>arn:aws:s3:::</code>.
     * </p>
     * <note>
     * <p>
     * This will also enable logging of data event activity performed by any user or role in your AWS account, even if
     * that activity is performed on a bucket that belongs to another AWS account.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * To log data events for all objects in all S3 buckets that include <i>my-bucket</i> in their names, specify the
     * prefix as <code>aws:s3:::my-bucket</code>. The trail logs data events for all objects in all buckets whose name
     * contains a match for <i>my-bucket</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     * <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3 bucket that
     * match the prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for all functions in your AWS account, specify the prefix as <code>arn:aws:lambda</code>.
     * </p>
     * <note>
     * <p>
     * This will also enable logging of <code>Invoke</code> activity performed by any user or role in your AWS account,
     * even if that activity is performed on a function that belongs to another AWS account.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * To log data eents for a specific Lambda function, specify the function ARN.
     * </p>
     * <note>
     * <p>
     * Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a function ARN
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>, data events will only be logged for
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>. They will not be logged for
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld2</i>.
     * </p>
     * </note></li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as
     *        <code>arn:aws:s3:::</code>.
     *        </p>
     *        <note>
     *        <p>
     *        This will also enable logging of data event activity performed by any user or role in your AWS account,
     *        even if that activity is performed on a bucket that belongs to another AWS account.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        To log data events for all objects in all S3 buckets that include <i>my-bucket</i> in their names, specify
     *        the prefix as <code>aws:s3:::my-bucket</code>. The trail logs data events for all objects in all buckets
     *        whose name contains a match for <i>my-bucket</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     *        <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To log data events for specific objects, specify the S3 bucket and object prefix such as
     *        <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3
     *        bucket that match the prefix.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To log data events for all functions in your AWS account, specify the prefix as
     *        <code>arn:aws:lambda</code>.
     *        </p>
     *        <note>
     *        <p>
     *        This will also enable logging of <code>Invoke</code> activity performed by any user or role in your AWS
     *        account, even if that activity is performed on a function that belongs to another AWS account.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        To log data eents for a specific Lambda function, specify the function ARN.
     *        </p>
     *        <note>
     *        <p>
     *        Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a function
     *        ARN <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>, data events will only be logged for
     *        <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>. They will not be logged for
     *        <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld2</i>.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataResource withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as
     * <code>arn:aws:s3:::</code>.
     * </p>
     * <note>
     * <p>
     * This will also enable logging of data event activity performed by any user or role in your AWS account, even if
     * that activity is performed on a bucket that belongs to another AWS account.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * To log data events for all objects in all S3 buckets that include <i>my-bucket</i> in their names, specify the
     * prefix as <code>aws:s3:::my-bucket</code>. The trail logs data events for all objects in all buckets whose name
     * contains a match for <i>my-bucket</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     * <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for specific objects, specify the S3 bucket and object prefix such as
     * <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3 bucket that
     * match the prefix.
     * </p>
     * </li>
     * <li>
     * <p>
     * To log data events for all functions in your AWS account, specify the prefix as <code>arn:aws:lambda</code>.
     * </p>
     * <note>
     * <p>
     * This will also enable logging of <code>Invoke</code> activity performed by any user or role in your AWS account,
     * even if that activity is performed on a function that belongs to another AWS account.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * To log data eents for a specific Lambda function, specify the function ARN.
     * </p>
     * <note>
     * <p>
     * Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a function ARN
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>, data events will only be logged for
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>. They will not be logged for
     * <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld2</i>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param values
     *        An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as
     *        <code>arn:aws:s3:::</code>.
     *        </p>
     *        <note>
     *        <p>
     *        This will also enable logging of data event activity performed by any user or role in your AWS account,
     *        even if that activity is performed on a bucket that belongs to another AWS account.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        To log data events for all objects in all S3 buckets that include <i>my-bucket</i> in their names, specify
     *        the prefix as <code>aws:s3:::my-bucket</code>. The trail logs data events for all objects in all buckets
     *        whose name contains a match for <i>my-bucket</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as
     *        <code>arn:aws:s3:::bucket-1/</code>. The trail logs data events for all objects in this S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To log data events for specific objects, specify the S3 bucket and object prefix such as
     *        <code>arn:aws:s3:::bucket-1/example-images</code>. The trail logs data events for objects in this S3
     *        bucket that match the prefix.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To log data events for all functions in your AWS account, specify the prefix as
     *        <code>arn:aws:lambda</code>.
     *        </p>
     *        <note>
     *        <p>
     *        This will also enable logging of <code>Invoke</code> activity performed by any user or role in your AWS
     *        account, even if that activity is performed on a function that belongs to another AWS account.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        To log data eents for a specific Lambda function, specify the function ARN.
     *        </p>
     *        <note>
     *        <p>
     *        Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a function
     *        ARN <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>, data events will only be logged for
     *        <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld</i>. They will not be logged for
     *        <i>arn:aws:lambda:us-west-2:111111111111:function:helloworld2</i>.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataResource withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataResource == false)
            return false;
        DataResource other = (DataResource) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public DataResource clone() {
        try {
            return (DataResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.DataResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
