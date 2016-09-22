/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class UpdateEventSourceMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The event source mapping identifier.
     * </p>
     */
    private String uUID;
    /**
     * <p>
     * The Lambda function to which you want the stream records sent.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>).
     * </p>
     * <p>
     * If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function
     * version or alias name as suffix). For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>
     * </p>
     * <p>
     * Note that the length constraint applies only to the ARN. If you specify only the function name, it is limited to
     * 64 character in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll the
     * stream.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The maximum number of stream records that can be sent to your Lambda function for a single invocation.
     * </p>
     */
    private Integer batchSize;

    /**
     * <p>
     * The event source mapping identifier.
     * </p>
     * 
     * @param uUID
     *        The event source mapping identifier.
     */

    public void setUUID(String uUID) {
        this.uUID = uUID;
    }

    /**
     * <p>
     * The event source mapping identifier.
     * </p>
     * 
     * @return The event source mapping identifier.
     */

    public String getUUID() {
        return this.uUID;
    }

    /**
     * <p>
     * The event source mapping identifier.
     * </p>
     * 
     * @param uUID
     *        The event source mapping identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventSourceMappingRequest withUUID(String uUID) {
        setUUID(uUID);
        return this;
    }

    /**
     * <p>
     * The Lambda function to which you want the stream records sent.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>).
     * </p>
     * <p>
     * If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function
     * version or alias name as suffix). For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>
     * </p>
     * <p>
     * Note that the length constraint applies only to the ARN. If you specify only the function name, it is limited to
     * 64 character in length.
     * </p>
     * 
     * @param functionName
     *        The Lambda function to which you want the stream records sent.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>).
     *        </p>
     *        <p>
     *        If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with
     *        function version or alias name as suffix). For more information about versioning, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning
     *        and Aliases</a>
     *        </p>
     *        <p>
     *        Note that the length constraint applies only to the ARN. If you specify only the function name, it is
     *        limited to 64 character in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The Lambda function to which you want the stream records sent.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>).
     * </p>
     * <p>
     * If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function
     * version or alias name as suffix). For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>
     * </p>
     * <p>
     * Note that the length constraint applies only to the ARN. If you specify only the function name, it is limited to
     * 64 character in length.
     * </p>
     * 
     * @return The Lambda function to which you want the stream records sent.</p>
     *         <p>
     *         You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *         Name (ARN) of the function (for example,
     *         <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *         specify a partial ARN (for example, <code>account-id:Thumbnail</code>).
     *         </p>
     *         <p>
     *         If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with
     *         function version or alias name as suffix). For more information about versioning, see <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning
     *         and Aliases</a>
     *         </p>
     *         <p>
     *         Note that the length constraint applies only to the ARN. If you specify only the function name, it is
     *         limited to 64 character in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The Lambda function to which you want the stream records sent.
     * </p>
     * <p>
     * You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource Name
     * (ARN) of the function (for example, <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS
     * Lambda also allows you to specify a partial ARN (for example, <code>account-id:Thumbnail</code>).
     * </p>
     * <p>
     * If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with function
     * version or alias name as suffix). For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>
     * </p>
     * <p>
     * Note that the length constraint applies only to the ARN. If you specify only the function name, it is limited to
     * 64 character in length.
     * </p>
     * 
     * @param functionName
     *        The Lambda function to which you want the stream records sent.</p>
     *        <p>
     *        You can specify a function name (for example, <code>Thumbnail</code>) or you can specify Amazon Resource
     *        Name (ARN) of the function (for example,
     *        <code>arn:aws:lambda:us-west-2:account-id:function:ThumbNail</code>). AWS Lambda also allows you to
     *        specify a partial ARN (for example, <code>account-id:Thumbnail</code>).
     *        </p>
     *        <p>
     *        If you are using versioning, you can also provide a qualified function ARN (ARN that is qualified with
     *        function version or alias name as suffix). For more information about versioning, see <a
     *        href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning
     *        and Aliases</a>
     *        </p>
     *        <p>
     *        Note that the length constraint applies only to the ARN. If you specify only the function name, it is
     *        limited to 64 character in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventSourceMappingRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll the
     * stream.
     * </p>
     * 
     * @param enabled
     *        Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll
     *        the stream.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll the
     * stream.
     * </p>
     * 
     * @return Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not
     *         poll the stream.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll the
     * stream.
     * </p>
     * 
     * @param enabled
     *        Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll
     *        the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventSourceMappingRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll the
     * stream.
     * </p>
     * 
     * @return Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not
     *         poll the stream.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The maximum number of stream records that can be sent to your Lambda function for a single invocation.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of stream records that can be sent to your Lambda function for a single invocation.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The maximum number of stream records that can be sent to your Lambda function for a single invocation.
     * </p>
     * 
     * @return The maximum number of stream records that can be sent to your Lambda function for a single invocation.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The maximum number of stream records that can be sent to your Lambda function for a single invocation.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of stream records that can be sent to your Lambda function for a single invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventSourceMappingRequest withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUUID() != null)
            sb.append("UUID: " + getUUID() + ",");
        if (getFunctionName() != null)
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getBatchSize() != null)
            sb.append("BatchSize: " + getBatchSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEventSourceMappingRequest == false)
            return false;
        UpdateEventSourceMappingRequest other = (UpdateEventSourceMappingRequest) obj;
        if (other.getUUID() == null ^ this.getUUID() == null)
            return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEventSourceMappingRequest clone() {
        return (UpdateEventSourceMappingRequest) super.clone();
    }
}
