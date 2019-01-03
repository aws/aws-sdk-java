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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description and metadata for a Trusted Advisor check.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/TrustedAdvisorCheckDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustedAdvisorCheckDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The display name for the Trusted Advisor check.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the Trusted Advisor check, which includes the alert criteria and recommended actions (contains
     * HTML markup).
     * </p>
     */
    private String description;
    /**
     * <p>
     * The category of the Trusted Advisor check.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The column headings for the data returned by the Trusted Advisor check. The order of the headings corresponds to
     * the order of the data in the <b>Metadata</b> element of the <a>TrustedAdvisorResourceDetail</a> for the check.
     * <b>Metadata</b> contains all the data that is shown in the Excel download, even in those cases where the UI shows
     * just summary data.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> metadata;

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Trusted Advisor check.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @return The unique identifier for the Trusted Advisor check.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the Trusted Advisor check.
     * </p>
     * 
     * @param id
     *        The unique identifier for the Trusted Advisor check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckDescription withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The display name for the Trusted Advisor check.
     * </p>
     * 
     * @param name
     *        The display name for the Trusted Advisor check.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name for the Trusted Advisor check.
     * </p>
     * 
     * @return The display name for the Trusted Advisor check.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name for the Trusted Advisor check.
     * </p>
     * 
     * @param name
     *        The display name for the Trusted Advisor check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the Trusted Advisor check, which includes the alert criteria and recommended actions (contains
     * HTML markup).
     * </p>
     * 
     * @param description
     *        The description of the Trusted Advisor check, which includes the alert criteria and recommended actions
     *        (contains HTML markup).
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Trusted Advisor check, which includes the alert criteria and recommended actions (contains
     * HTML markup).
     * </p>
     * 
     * @return The description of the Trusted Advisor check, which includes the alert criteria and recommended actions
     *         (contains HTML markup).
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Trusted Advisor check, which includes the alert criteria and recommended actions (contains
     * HTML markup).
     * </p>
     * 
     * @param description
     *        The description of the Trusted Advisor check, which includes the alert criteria and recommended actions
     *        (contains HTML markup).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The category of the Trusted Advisor check.
     * </p>
     * 
     * @param category
     *        The category of the Trusted Advisor check.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the Trusted Advisor check.
     * </p>
     * 
     * @return The category of the Trusted Advisor check.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of the Trusted Advisor check.
     * </p>
     * 
     * @param category
     *        The category of the Trusted Advisor check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckDescription withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The column headings for the data returned by the Trusted Advisor check. The order of the headings corresponds to
     * the order of the data in the <b>Metadata</b> element of the <a>TrustedAdvisorResourceDetail</a> for the check.
     * <b>Metadata</b> contains all the data that is shown in the Excel download, even in those cases where the UI shows
     * just summary data.
     * </p>
     * 
     * @return The column headings for the data returned by the Trusted Advisor check. The order of the headings
     *         corresponds to the order of the data in the <b>Metadata</b> element of the
     *         <a>TrustedAdvisorResourceDetail</a> for the check. <b>Metadata</b> contains all the data that is shown in
     *         the Excel download, even in those cases where the UI shows just summary data.
     */

    public java.util.List<String> getMetadata() {
        if (metadata == null) {
            metadata = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return metadata;
    }

    /**
     * <p>
     * The column headings for the data returned by the Trusted Advisor check. The order of the headings corresponds to
     * the order of the data in the <b>Metadata</b> element of the <a>TrustedAdvisorResourceDetail</a> for the check.
     * <b>Metadata</b> contains all the data that is shown in the Excel download, even in those cases where the UI shows
     * just summary data.
     * </p>
     * 
     * @param metadata
     *        The column headings for the data returned by the Trusted Advisor check. The order of the headings
     *        corresponds to the order of the data in the <b>Metadata</b> element of the
     *        <a>TrustedAdvisorResourceDetail</a> for the check. <b>Metadata</b> contains all the data that is shown in
     *        the Excel download, even in those cases where the UI shows just summary data.
     */

    public void setMetadata(java.util.Collection<String> metadata) {
        if (metadata == null) {
            this.metadata = null;
            return;
        }

        this.metadata = new com.amazonaws.internal.SdkInternalList<String>(metadata);
    }

    /**
     * <p>
     * The column headings for the data returned by the Trusted Advisor check. The order of the headings corresponds to
     * the order of the data in the <b>Metadata</b> element of the <a>TrustedAdvisorResourceDetail</a> for the check.
     * <b>Metadata</b> contains all the data that is shown in the Excel download, even in those cases where the UI shows
     * just summary data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetadata(java.util.Collection)} or {@link #withMetadata(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metadata
     *        The column headings for the data returned by the Trusted Advisor check. The order of the headings
     *        corresponds to the order of the data in the <b>Metadata</b> element of the
     *        <a>TrustedAdvisorResourceDetail</a> for the check. <b>Metadata</b> contains all the data that is shown in
     *        the Excel download, even in those cases where the UI shows just summary data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckDescription withMetadata(String... metadata) {
        if (this.metadata == null) {
            setMetadata(new com.amazonaws.internal.SdkInternalList<String>(metadata.length));
        }
        for (String ele : metadata) {
            this.metadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The column headings for the data returned by the Trusted Advisor check. The order of the headings corresponds to
     * the order of the data in the <b>Metadata</b> element of the <a>TrustedAdvisorResourceDetail</a> for the check.
     * <b>Metadata</b> contains all the data that is shown in the Excel download, even in those cases where the UI shows
     * just summary data.
     * </p>
     * 
     * @param metadata
     *        The column headings for the data returned by the Trusted Advisor check. The order of the headings
     *        corresponds to the order of the data in the <b>Metadata</b> element of the
     *        <a>TrustedAdvisorResourceDetail</a> for the check. <b>Metadata</b> contains all the data that is shown in
     *        the Excel download, even in those cases where the UI shows just summary data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedAdvisorCheckDescription withMetadata(java.util.Collection<String> metadata) {
        setMetadata(metadata);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedAdvisorCheckDescription == false)
            return false;
        TrustedAdvisorCheckDescription other = (TrustedAdvisorCheckDescription) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public TrustedAdvisorCheckDescription clone() {
        try {
            return (TrustedAdvisorCheckDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.TrustedAdvisorCheckDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
