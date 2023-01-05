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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action that writes data to an Amazon OpenSearch Service domain.
 * </p>
 * <note>
 * <p>
 * The <code>Elasticsearch</code> action can only be used by existing rule actions. To create a new rule action or to
 * update an existing rule action, use the <code>OpenSearch</code> rule action instead. For more information, see <a
 * href="https://docs.aws.amazon.com/iot/latest/apireference/API_OpenSearchAction.html">OpenSearchAction</a>.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticsearchAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM role ARN that has access to OpenSearch.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The endpoint of your OpenSearch domain.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The index where you want to store your data.
     * </p>
     */
    private String index;
    /**
     * <p>
     * The type of document you are storing.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The unique identifier for the document you are storing.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The IAM role ARN that has access to OpenSearch.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN that has access to OpenSearch.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that has access to OpenSearch.
     * </p>
     * 
     * @return The IAM role ARN that has access to OpenSearch.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that has access to OpenSearch.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN that has access to OpenSearch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The endpoint of your OpenSearch domain.
     * </p>
     * 
     * @param endpoint
     *        The endpoint of your OpenSearch domain.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint of your OpenSearch domain.
     * </p>
     * 
     * @return The endpoint of your OpenSearch domain.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint of your OpenSearch domain.
     * </p>
     * 
     * @param endpoint
     *        The endpoint of your OpenSearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchAction withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The index where you want to store your data.
     * </p>
     * 
     * @param index
     *        The index where you want to store your data.
     */

    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * <p>
     * The index where you want to store your data.
     * </p>
     * 
     * @return The index where you want to store your data.
     */

    public String getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The index where you want to store your data.
     * </p>
     * 
     * @param index
     *        The index where you want to store your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchAction withIndex(String index) {
        setIndex(index);
        return this;
    }

    /**
     * <p>
     * The type of document you are storing.
     * </p>
     * 
     * @param type
     *        The type of document you are storing.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of document you are storing.
     * </p>
     * 
     * @return The type of document you are storing.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of document you are storing.
     * </p>
     * 
     * @param type
     *        The type of document you are storing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchAction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the document you are storing.
     * </p>
     * 
     * @param id
     *        The unique identifier for the document you are storing.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the document you are storing.
     * </p>
     * 
     * @return The unique identifier for the document you are storing.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the document you are storing.
     * </p>
     * 
     * @param id
     *        The unique identifier for the document you are storing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchAction withId(String id) {
        setId(id);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticsearchAction == false)
            return false;
        ElasticsearchAction other = (ElasticsearchAction) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public ElasticsearchAction clone() {
        try {
            return (ElasticsearchAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ElasticsearchActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
