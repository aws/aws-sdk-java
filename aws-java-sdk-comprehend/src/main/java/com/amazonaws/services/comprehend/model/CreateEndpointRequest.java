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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/CreateEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is the descriptive suffix that becomes part of the <code>EndpointArn</code> used for all subsequent requests
     * to this resource.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint will be attached.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents
     * of a throughput of 100 characters per second.
     * </p>
     */
    private Integer desiredInferenceUnits;
    /**
     * <p>
     * An idempotency token provided by the customer. If this token matches a previous endpoint creation request, Amazon
     * Comprehend will not return a <code>ResourceInUseException</code>.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the endpoint.
     * For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by the sales
     * department.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * This is the descriptive suffix that becomes part of the <code>EndpointArn</code> used for all subsequent requests
     * to this resource.
     * </p>
     * 
     * @param endpointName
     *        This is the descriptive suffix that becomes part of the <code>EndpointArn</code> used for all subsequent
     *        requests to this resource.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * This is the descriptive suffix that becomes part of the <code>EndpointArn</code> used for all subsequent requests
     * to this resource.
     * </p>
     * 
     * @return This is the descriptive suffix that becomes part of the <code>EndpointArn</code> used for all subsequent
     *         requests to this resource.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * This is the descriptive suffix that becomes part of the <code>EndpointArn</code> used for all subsequent requests
     * to this resource.
     * </p>
     * 
     * @param endpointName
     *        This is the descriptive suffix that becomes part of the <code>EndpointArn</code> used for all subsequent
     *        requests to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint will be attached.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Number (ARN) of the model to which the endpoint will be attached.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint will be attached.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the model to which the endpoint will be attached.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint will be attached.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Number (ARN) of the model to which the endpoint will be attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents
     * of a throughput of 100 characters per second.
     * </p>
     * 
     * @param desiredInferenceUnits
     *        The desired number of inference units to be used by the model using this endpoint. Each inference unit
     *        represents of a throughput of 100 characters per second.
     */

    public void setDesiredInferenceUnits(Integer desiredInferenceUnits) {
        this.desiredInferenceUnits = desiredInferenceUnits;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents
     * of a throughput of 100 characters per second.
     * </p>
     * 
     * @return The desired number of inference units to be used by the model using this endpoint. Each inference unit
     *         represents of a throughput of 100 characters per second.
     */

    public Integer getDesiredInferenceUnits() {
        return this.desiredInferenceUnits;
    }

    /**
     * <p>
     * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents
     * of a throughput of 100 characters per second.
     * </p>
     * 
     * @param desiredInferenceUnits
     *        The desired number of inference units to be used by the model using this endpoint. Each inference unit
     *        represents of a throughput of 100 characters per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withDesiredInferenceUnits(Integer desiredInferenceUnits) {
        setDesiredInferenceUnits(desiredInferenceUnits);
        return this;
    }

    /**
     * <p>
     * An idempotency token provided by the customer. If this token matches a previous endpoint creation request, Amazon
     * Comprehend will not return a <code>ResourceInUseException</code>.
     * </p>
     * 
     * @param clientRequestToken
     *        An idempotency token provided by the customer. If this token matches a previous endpoint creation request,
     *        Amazon Comprehend will not return a <code>ResourceInUseException</code>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * An idempotency token provided by the customer. If this token matches a previous endpoint creation request, Amazon
     * Comprehend will not return a <code>ResourceInUseException</code>.
     * </p>
     * 
     * @return An idempotency token provided by the customer. If this token matches a previous endpoint creation
     *         request, Amazon Comprehend will not return a <code>ResourceInUseException</code>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * An idempotency token provided by the customer. If this token matches a previous endpoint creation request, Amazon
     * Comprehend will not return a <code>ResourceInUseException</code>.
     * </p>
     * 
     * @param clientRequestToken
     *        An idempotency token provided by the customer. If this token matches a previous endpoint creation request,
     *        Amazon Comprehend will not return a <code>ResourceInUseException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the endpoint.
     * For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by the sales
     * department.
     * </p>
     * 
     * @return Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the
     *         endpoint. For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by
     *         the sales department.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the endpoint.
     * For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by the sales
     * department.
     * </p>
     * 
     * @param tags
     *        Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the
     *        endpoint. For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by
     *        the sales department.
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
     * Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the endpoint.
     * For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by the sales
     * department.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the
     *        endpoint. For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by
     *        the sales department.
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
     * Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the endpoint.
     * For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by the sales
     * department.
     * </p>
     * 
     * @param tags
     *        Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the
     *        endpoint. For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by
     *        the sales department.
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
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getDesiredInferenceUnits() != null)
            sb.append("DesiredInferenceUnits: ").append(getDesiredInferenceUnits()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getDesiredInferenceUnits() == null ^ this.getDesiredInferenceUnits() == null)
            return false;
        if (other.getDesiredInferenceUnits() != null && other.getDesiredInferenceUnits().equals(this.getDesiredInferenceUnits()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getDesiredInferenceUnits() == null) ? 0 : getDesiredInferenceUnits().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEndpointRequest clone() {
        return (CreateEndpointRequest) super.clone();
    }

}
