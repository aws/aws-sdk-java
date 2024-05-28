/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the index.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * A name for the Amazon Q Business index.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The index type that's suitable for your needs. For more information on what's included in each type of index or
     * index tier, see <a href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q
     * Business tiers</a>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A description for the Amazon Q Business index.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of key-value pairs that identify or categorize the index. You can also use tags to help control access to
     * the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following
     * symbols: _ . : / = + - @.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The capacity units you want to provision for your index. You can add and remove capacity to fit your usage needs.
     * </p>
     */
    private IndexCapacityConfiguration capacityConfiguration;
    /**
     * <p>
     * A token that you provide to identify the request to create an index. Multiple calls to the
     * <code>CreateIndex</code> API with the same client token will create only one index.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the index.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application using the index.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the index.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application using the index.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the index.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application using the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * A name for the Amazon Q Business index.
     * </p>
     * 
     * @param displayName
     *        A name for the Amazon Q Business index.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * A name for the Amazon Q Business index.
     * </p>
     * 
     * @return A name for the Amazon Q Business index.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * A name for the Amazon Q Business index.
     * </p>
     * 
     * @param displayName
     *        A name for the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The index type that's suitable for your needs. For more information on what's included in each type of index or
     * index tier, see <a href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q
     * Business tiers</a>.
     * </p>
     * 
     * @param type
     *        The index type that's suitable for your needs. For more information on what's included in each type of
     *        index or index tier, see <a
     *        href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q Business
     *        tiers</a>.
     * @see IndexType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The index type that's suitable for your needs. For more information on what's included in each type of index or
     * index tier, see <a href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q
     * Business tiers</a>.
     * </p>
     * 
     * @return The index type that's suitable for your needs. For more information on what's included in each type of
     *         index or index tier, see <a
     *         href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q Business
     *         tiers</a>.
     * @see IndexType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The index type that's suitable for your needs. For more information on what's included in each type of index or
     * index tier, see <a href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q
     * Business tiers</a>.
     * </p>
     * 
     * @param type
     *        The index type that's suitable for your needs. For more information on what's included in each type of
     *        index or index tier, see <a
     *        href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q Business
     *        tiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public CreateIndexRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The index type that's suitable for your needs. For more information on what's included in each type of index or
     * index tier, see <a href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q
     * Business tiers</a>.
     * </p>
     * 
     * @param type
     *        The index type that's suitable for your needs. For more information on what's included in each type of
     *        index or index tier, see <a
     *        href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q Business
     *        tiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public CreateIndexRequest withType(IndexType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A description for the Amazon Q Business index.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Q Business index.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the Amazon Q Business index.
     * </p>
     * 
     * @return A description for the Amazon Q Business index.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the Amazon Q Business index.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the index. You can also use tags to help control access to
     * the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following
     * symbols: _ . : / = + - @.
     * </p>
     * 
     * @return A list of key-value pairs that identify or categorize the index. You can also use tags to help control
     *         access to the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of
     *         the following symbols: _ . : / = + - @.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the index. You can also use tags to help control access to
     * the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following
     * symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the index. You can also use tags to help control
     *        access to the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of
     *        the following symbols: _ . : / = + - @.
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
     * A list of key-value pairs that identify or categorize the index. You can also use tags to help control access to
     * the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following
     * symbols: _ . : / = + - @.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the index. You can also use tags to help control
     *        access to the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of
     *        the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withTags(Tag... tags) {
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
     * A list of key-value pairs that identify or categorize the index. You can also use tags to help control access to
     * the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following
     * symbols: _ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the index. You can also use tags to help control
     *        access to the index. Tag keys and values can consist of Unicode letters, digits, white space, and any of
     *        the following symbols: _ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The capacity units you want to provision for your index. You can add and remove capacity to fit your usage needs.
     * </p>
     * 
     * @param capacityConfiguration
     *        The capacity units you want to provision for your index. You can add and remove capacity to fit your usage
     *        needs.
     */

    public void setCapacityConfiguration(IndexCapacityConfiguration capacityConfiguration) {
        this.capacityConfiguration = capacityConfiguration;
    }

    /**
     * <p>
     * The capacity units you want to provision for your index. You can add and remove capacity to fit your usage needs.
     * </p>
     * 
     * @return The capacity units you want to provision for your index. You can add and remove capacity to fit your
     *         usage needs.
     */

    public IndexCapacityConfiguration getCapacityConfiguration() {
        return this.capacityConfiguration;
    }

    /**
     * <p>
     * The capacity units you want to provision for your index. You can add and remove capacity to fit your usage needs.
     * </p>
     * 
     * @param capacityConfiguration
     *        The capacity units you want to provision for your index. You can add and remove capacity to fit your usage
     *        needs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withCapacityConfiguration(IndexCapacityConfiguration capacityConfiguration) {
        setCapacityConfiguration(capacityConfiguration);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create an index. Multiple calls to the
     * <code>CreateIndex</code> API with the same client token will create only one index.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create an index. Multiple calls to the
     *        <code>CreateIndex</code> API with the same client token will create only one index.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create an index. Multiple calls to the
     * <code>CreateIndex</code> API with the same client token will create only one index.
     * </p>
     * 
     * @return A token that you provide to identify the request to create an index. Multiple calls to the
     *         <code>CreateIndex</code> API with the same client token will create only one index.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create an index. Multiple calls to the
     * <code>CreateIndex</code> API with the same client token will create only one index.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create an index. Multiple calls to the
     *        <code>CreateIndex</code> API with the same client token will create only one index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIndexRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCapacityConfiguration() != null)
            sb.append("CapacityConfiguration: ").append(getCapacityConfiguration()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIndexRequest == false)
            return false;
        CreateIndexRequest other = (CreateIndexRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCapacityConfiguration() == null ^ this.getCapacityConfiguration() == null)
            return false;
        if (other.getCapacityConfiguration() != null && other.getCapacityConfiguration().equals(this.getCapacityConfiguration()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCapacityConfiguration() == null) ? 0 : getCapacityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateIndexRequest clone() {
        return (CreateIndexRequest) super.clone();
    }

}
