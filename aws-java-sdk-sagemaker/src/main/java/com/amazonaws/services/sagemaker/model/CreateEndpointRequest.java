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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the endpoint. The name must be unique within an AWS Region in your AWS account.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The name of an endpoint configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html">CreateEndpointConfig</a>.
     * </p>
     */
    private String endpointConfigName;
    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a>in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the endpoint. The name must be unique within an AWS Region in your AWS account.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint. The name must be unique within an AWS Region in your AWS account.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint. The name must be unique within an AWS Region in your AWS account.
     * </p>
     * 
     * @return The name of the endpoint. The name must be unique within an AWS Region in your AWS account.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint. The name must be unique within an AWS Region in your AWS account.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint. The name must be unique within an AWS Region in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The name of an endpoint configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html">CreateEndpointConfig</a>.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of an endpoint configuration. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html"
     *        >CreateEndpointConfig</a>.
     */

    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of an endpoint configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html">CreateEndpointConfig</a>.
     * </p>
     * 
     * @return The name of an endpoint configuration. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html"
     *         >CreateEndpointConfig</a>.
     */

    public String getEndpointConfigName() {
        return this.endpointConfigName;
    }

    /**
     * <p>
     * The name of an endpoint configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html">CreateEndpointConfig</a>.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of an endpoint configuration. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html"
     *        >CreateEndpointConfig</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withEndpointConfigName(String endpointConfigName) {
        setEndpointConfigName(endpointConfigName);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a>in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return An array of key-value pairs. For more information, see <a
     *         href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a>in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a>in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a>in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a>in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a>in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a>in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a>in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: ").append(getEndpointConfigName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndpointRequest == false)
            return false;
        CreateEndpointRequest other = (CreateEndpointRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEndpointRequest clone() {
        return (CreateEndpointRequest) super.clone();
    }

}
