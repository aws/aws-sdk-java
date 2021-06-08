/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateManagedPrefixListRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateManagedPrefixListRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateManagedPrefixListRequest> {

    /**
     * <p>
     * A name for the prefix list.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. The name cannot start with <code>com.amazonaws</code>.
     * </p>
     */
    private String prefixListName;
    /**
     * <p>
     * One or more entries for the prefix list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AddPrefixListEntry> entries;
    /**
     * <p>
     * The maximum number of entries for the prefix list.
     * </p>
     */
    private Integer maxEntries;
    /**
     * <p>
     * The tags to apply to the prefix list during creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * The IP address type.
     * </p>
     * <p>
     * Valid Values: <code>IPv4</code> | <code>IPv6</code>
     * </p>
     */
    private String addressFamily;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Up to 255 UTF-8 characters in length.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A name for the prefix list.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. The name cannot start with <code>com.amazonaws</code>.
     * </p>
     * 
     * @param prefixListName
     *        A name for the prefix list.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length. The name cannot start with <code>com.amazonaws</code>.
     */

    public void setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
    }

    /**
     * <p>
     * A name for the prefix list.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. The name cannot start with <code>com.amazonaws</code>.
     * </p>
     * 
     * @return A name for the prefix list.</p>
     *         <p>
     *         Constraints: Up to 255 characters in length. The name cannot start with <code>com.amazonaws</code>.
     */

    public String getPrefixListName() {
        return this.prefixListName;
    }

    /**
     * <p>
     * A name for the prefix list.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. The name cannot start with <code>com.amazonaws</code>.
     * </p>
     * 
     * @param prefixListName
     *        A name for the prefix list.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length. The name cannot start with <code>com.amazonaws</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedPrefixListRequest withPrefixListName(String prefixListName) {
        setPrefixListName(prefixListName);
        return this;
    }

    /**
     * <p>
     * One or more entries for the prefix list.
     * </p>
     * 
     * @return One or more entries for the prefix list.
     */

    public java.util.List<AddPrefixListEntry> getEntries() {
        if (entries == null) {
            entries = new com.amazonaws.internal.SdkInternalList<AddPrefixListEntry>();
        }
        return entries;
    }

    /**
     * <p>
     * One or more entries for the prefix list.
     * </p>
     * 
     * @param entries
     *        One or more entries for the prefix list.
     */

    public void setEntries(java.util.Collection<AddPrefixListEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new com.amazonaws.internal.SdkInternalList<AddPrefixListEntry>(entries);
    }

    /**
     * <p>
     * One or more entries for the prefix list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        One or more entries for the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedPrefixListRequest withEntries(AddPrefixListEntry... entries) {
        if (this.entries == null) {
            setEntries(new com.amazonaws.internal.SdkInternalList<AddPrefixListEntry>(entries.length));
        }
        for (AddPrefixListEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more entries for the prefix list.
     * </p>
     * 
     * @param entries
     *        One or more entries for the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedPrefixListRequest withEntries(java.util.Collection<AddPrefixListEntry> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * The maximum number of entries for the prefix list.
     * </p>
     * 
     * @param maxEntries
     *        The maximum number of entries for the prefix list.
     */

    public void setMaxEntries(Integer maxEntries) {
        this.maxEntries = maxEntries;
    }

    /**
     * <p>
     * The maximum number of entries for the prefix list.
     * </p>
     * 
     * @return The maximum number of entries for the prefix list.
     */

    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    /**
     * <p>
     * The maximum number of entries for the prefix list.
     * </p>
     * 
     * @param maxEntries
     *        The maximum number of entries for the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedPrefixListRequest withMaxEntries(Integer maxEntries) {
        setMaxEntries(maxEntries);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the prefix list during creation.
     * </p>
     * 
     * @return The tags to apply to the prefix list during creation.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the prefix list during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the prefix list during creation.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the prefix list during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the prefix list during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedPrefixListRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the prefix list during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the prefix list during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedPrefixListRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The IP address type.
     * </p>
     * <p>
     * Valid Values: <code>IPv4</code> | <code>IPv6</code>
     * </p>
     * 
     * @param addressFamily
     *        The IP address type.</p>
     *        <p>
     *        Valid Values: <code>IPv4</code> | <code>IPv6</code>
     */

    public void setAddressFamily(String addressFamily) {
        this.addressFamily = addressFamily;
    }

    /**
     * <p>
     * The IP address type.
     * </p>
     * <p>
     * Valid Values: <code>IPv4</code> | <code>IPv6</code>
     * </p>
     * 
     * @return The IP address type.</p>
     *         <p>
     *         Valid Values: <code>IPv4</code> | <code>IPv6</code>
     */

    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * <p>
     * The IP address type.
     * </p>
     * <p>
     * Valid Values: <code>IPv4</code> | <code>IPv6</code>
     * </p>
     * 
     * @param addressFamily
     *        The IP address type.</p>
     *        <p>
     *        Valid Values: <code>IPv4</code> | <code>IPv6</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedPrefixListRequest withAddressFamily(String addressFamily) {
        setAddressFamily(addressFamily);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Up to 255 UTF-8 characters in length.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraints: Up to 255 UTF-8 characters in length.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Up to 255 UTF-8 characters in length.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.</p>
     *         <p>
     *         Constraints: Up to 255 UTF-8 characters in length.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Up to 255 UTF-8 characters in length.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraints: Up to 255 UTF-8 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedPrefixListRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateManagedPrefixListRequest> getDryRunRequest() {
        Request<CreateManagedPrefixListRequest> request = new CreateManagedPrefixListRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getPrefixListName() != null)
            sb.append("PrefixListName: ").append(getPrefixListName()).append(",");
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries()).append(",");
        if (getMaxEntries() != null)
            sb.append("MaxEntries: ").append(getMaxEntries()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getAddressFamily() != null)
            sb.append("AddressFamily: ").append(getAddressFamily()).append(",");
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

        if (obj instanceof CreateManagedPrefixListRequest == false)
            return false;
        CreateManagedPrefixListRequest other = (CreateManagedPrefixListRequest) obj;
        if (other.getPrefixListName() == null ^ this.getPrefixListName() == null)
            return false;
        if (other.getPrefixListName() != null && other.getPrefixListName().equals(this.getPrefixListName()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        if (other.getMaxEntries() == null ^ this.getMaxEntries() == null)
            return false;
        if (other.getMaxEntries() != null && other.getMaxEntries().equals(this.getMaxEntries()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getAddressFamily() == null ^ this.getAddressFamily() == null)
            return false;
        if (other.getAddressFamily() != null && other.getAddressFamily().equals(this.getAddressFamily()) == false)
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

        hashCode = prime * hashCode + ((getPrefixListName() == null) ? 0 : getPrefixListName().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getMaxEntries() == null) ? 0 : getMaxEntries().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getAddressFamily() == null) ? 0 : getAddressFamily().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateManagedPrefixListRequest clone() {
        return (CreateManagedPrefixListRequest) super.clone();
    }
}
