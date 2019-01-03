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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An activity that runs a Lambda function to modify the message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/LambdaActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the 'lambda' activity.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the Lambda function that is run on the message.
     * </p>
     */
    private String lambdaName;
    /**
     * <p>
     * The number of messages passed to the Lambda function for processing.
     * </p>
     * <p>
     * The AWS Lambda function must be able to process all of these messages within five minutes, which is the maximum
     * timeout duration for Lambda functions.
     * </p>
     */
    private Integer batchSize;
    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     */
    private String next;

    /**
     * <p>
     * The name of the 'lambda' activity.
     * </p>
     * 
     * @param name
     *        The name of the 'lambda' activity.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the 'lambda' activity.
     * </p>
     * 
     * @return The name of the 'lambda' activity.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the 'lambda' activity.
     * </p>
     * 
     * @param name
     *        The name of the 'lambda' activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaActivity withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the Lambda function that is run on the message.
     * </p>
     * 
     * @param lambdaName
     *        The name of the Lambda function that is run on the message.
     */

    public void setLambdaName(String lambdaName) {
        this.lambdaName = lambdaName;
    }

    /**
     * <p>
     * The name of the Lambda function that is run on the message.
     * </p>
     * 
     * @return The name of the Lambda function that is run on the message.
     */

    public String getLambdaName() {
        return this.lambdaName;
    }

    /**
     * <p>
     * The name of the Lambda function that is run on the message.
     * </p>
     * 
     * @param lambdaName
     *        The name of the Lambda function that is run on the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaActivity withLambdaName(String lambdaName) {
        setLambdaName(lambdaName);
        return this;
    }

    /**
     * <p>
     * The number of messages passed to the Lambda function for processing.
     * </p>
     * <p>
     * The AWS Lambda function must be able to process all of these messages within five minutes, which is the maximum
     * timeout duration for Lambda functions.
     * </p>
     * 
     * @param batchSize
     *        The number of messages passed to the Lambda function for processing.</p>
     *        <p>
     *        The AWS Lambda function must be able to process all of these messages within five minutes, which is the
     *        maximum timeout duration for Lambda functions.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The number of messages passed to the Lambda function for processing.
     * </p>
     * <p>
     * The AWS Lambda function must be able to process all of these messages within five minutes, which is the maximum
     * timeout duration for Lambda functions.
     * </p>
     * 
     * @return The number of messages passed to the Lambda function for processing.</p>
     *         <p>
     *         The AWS Lambda function must be able to process all of these messages within five minutes, which is the
     *         maximum timeout duration for Lambda functions.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The number of messages passed to the Lambda function for processing.
     * </p>
     * <p>
     * The AWS Lambda function must be able to process all of these messages within five minutes, which is the maximum
     * timeout duration for Lambda functions.
     * </p>
     * 
     * @param batchSize
     *        The number of messages passed to the Lambda function for processing.</p>
     *        <p>
     *        The AWS Lambda function must be able to process all of these messages within five minutes, which is the
     *        maximum timeout duration for Lambda functions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaActivity withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @param next
     *        The next activity in the pipeline.
     */

    public void setNext(String next) {
        this.next = next;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @return The next activity in the pipeline.
     */

    public String getNext() {
        return this.next;
    }

    /**
     * <p>
     * The next activity in the pipeline.
     * </p>
     * 
     * @param next
     *        The next activity in the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaActivity withNext(String next) {
        setNext(next);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLambdaName() != null)
            sb.append("LambdaName: ").append(getLambdaName()).append(",");
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getNext() != null)
            sb.append("Next: ").append(getNext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaActivity == false)
            return false;
        LambdaActivity other = (LambdaActivity) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLambdaName() == null ^ this.getLambdaName() == null)
            return false;
        if (other.getLambdaName() != null && other.getLambdaName().equals(this.getLambdaName()) == false)
            return false;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getNext() == null ^ this.getNext() == null)
            return false;
        if (other.getNext() != null && other.getNext().equals(this.getNext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLambdaName() == null) ? 0 : getLambdaName().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        return hashCode;
    }

    @Override
    public LambdaActivity clone() {
        try {
            return (LambdaActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.LambdaActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
