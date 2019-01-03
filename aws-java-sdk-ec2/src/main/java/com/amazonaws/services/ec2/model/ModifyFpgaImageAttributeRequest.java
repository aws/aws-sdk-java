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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyFpgaImageAttributeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyFpgaImageAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyFpgaImageAttributeRequest> {

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     */
    private String fpgaImageId;
    /**
     * <p>
     * The name of the attribute.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The operation type.
     * </p>
     */
    private String operationType;
    /**
     * <p>
     * One or more AWS account IDs. This parameter is valid only when modifying the <code>loadPermission</code>
     * attribute.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userIds;
    /**
     * <p>
     * One or more user groups. This parameter is valid only when modifying the <code>loadPermission</code> attribute.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userGroups;
    /**
     * <p>
     * One or more product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid
     * only when modifying the <code>productCodes</code> attribute.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> productCodes;
    /**
     * <p>
     * The load permission for the AFI.
     * </p>
     */
    private LoadPermissionModifications loadPermission;
    /**
     * <p>
     * A description for the AFI.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A name for the AFI.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * 
     * @param fpgaImageId
     *        The ID of the AFI.
     */

    public void setFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * 
     * @return The ID of the AFI.
     */

    public String getFpgaImageId() {
        return this.fpgaImageId;
    }

    /**
     * <p>
     * The ID of the AFI.
     * </p>
     * 
     * @param fpgaImageId
     *        The ID of the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFpgaImageAttributeRequest withFpgaImageId(String fpgaImageId) {
        setFpgaImageId(fpgaImageId);
        return this;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute.
     * @see FpgaImageAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @return The name of the attribute.
     * @see FpgaImageAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FpgaImageAttributeName
     */

    public ModifyFpgaImageAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FpgaImageAttributeName
     */

    public ModifyFpgaImageAttributeRequest withAttribute(FpgaImageAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The operation type.
     * </p>
     * 
     * @param operationType
     *        The operation type.
     * @see OperationType
     */

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    /**
     * <p>
     * The operation type.
     * </p>
     * 
     * @return The operation type.
     * @see OperationType
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * <p>
     * The operation type.
     * </p>
     * 
     * @param operationType
     *        The operation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public ModifyFpgaImageAttributeRequest withOperationType(String operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * The operation type.
     * </p>
     * 
     * @param operationType
     *        The operation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public ModifyFpgaImageAttributeRequest withOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
        return this;
    }

    /**
     * <p>
     * One or more AWS account IDs. This parameter is valid only when modifying the <code>loadPermission</code>
     * attribute.
     * </p>
     * 
     * @return One or more AWS account IDs. This parameter is valid only when modifying the <code>loadPermission</code>
     *         attribute.
     */

    public java.util.List<String> getUserIds() {
        if (userIds == null) {
            userIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userIds;
    }

    /**
     * <p>
     * One or more AWS account IDs. This parameter is valid only when modifying the <code>loadPermission</code>
     * attribute.
     * </p>
     * 
     * @param userIds
     *        One or more AWS account IDs. This parameter is valid only when modifying the <code>loadPermission</code>
     *        attribute.
     */

    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new com.amazonaws.internal.SdkInternalList<String>(userIds);
    }

    /**
     * <p>
     * One or more AWS account IDs. This parameter is valid only when modifying the <code>loadPermission</code>
     * attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        One or more AWS account IDs. This parameter is valid only when modifying the <code>loadPermission</code>
     *        attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFpgaImageAttributeRequest withUserIds(String... userIds) {
        if (this.userIds == null) {
            setUserIds(new com.amazonaws.internal.SdkInternalList<String>(userIds.length));
        }
        for (String ele : userIds) {
            this.userIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more AWS account IDs. This parameter is valid only when modifying the <code>loadPermission</code>
     * attribute.
     * </p>
     * 
     * @param userIds
     *        One or more AWS account IDs. This parameter is valid only when modifying the <code>loadPermission</code>
     *        attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFpgaImageAttributeRequest withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * One or more user groups. This parameter is valid only when modifying the <code>loadPermission</code> attribute.
     * </p>
     * 
     * @return One or more user groups. This parameter is valid only when modifying the <code>loadPermission</code>
     *         attribute.
     */

    public java.util.List<String> getUserGroups() {
        if (userGroups == null) {
            userGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userGroups;
    }

    /**
     * <p>
     * One or more user groups. This parameter is valid only when modifying the <code>loadPermission</code> attribute.
     * </p>
     * 
     * @param userGroups
     *        One or more user groups. This parameter is valid only when modifying the <code>loadPermission</code>
     *        attribute.
     */

    public void setUserGroups(java.util.Collection<String> userGroups) {
        if (userGroups == null) {
            this.userGroups = null;
            return;
        }

        this.userGroups = new com.amazonaws.internal.SdkInternalList<String>(userGroups);
    }

    /**
     * <p>
     * One or more user groups. This parameter is valid only when modifying the <code>loadPermission</code> attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserGroups(java.util.Collection)} or {@link #withUserGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userGroups
     *        One or more user groups. This parameter is valid only when modifying the <code>loadPermission</code>
     *        attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFpgaImageAttributeRequest withUserGroups(String... userGroups) {
        if (this.userGroups == null) {
            setUserGroups(new com.amazonaws.internal.SdkInternalList<String>(userGroups.length));
        }
        for (String ele : userGroups) {
            this.userGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more user groups. This parameter is valid only when modifying the <code>loadPermission</code> attribute.
     * </p>
     * 
     * @param userGroups
     *        One or more user groups. This parameter is valid only when modifying the <code>loadPermission</code>
     *        attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFpgaImageAttributeRequest withUserGroups(java.util.Collection<String> userGroups) {
        setUserGroups(userGroups);
        return this;
    }

    /**
     * <p>
     * One or more product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid
     * only when modifying the <code>productCodes</code> attribute.
     * </p>
     * 
     * @return One or more product codes. After you add a product code to an AFI, it can't be removed. This parameter is
     *         valid only when modifying the <code>productCodes</code> attribute.
     */

    public java.util.List<String> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return productCodes;
    }

    /**
     * <p>
     * One or more product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid
     * only when modifying the <code>productCodes</code> attribute.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes. After you add a product code to an AFI, it can't be removed. This parameter is
     *        valid only when modifying the <code>productCodes</code> attribute.
     */

    public void setProductCodes(java.util.Collection<String> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new com.amazonaws.internal.SdkInternalList<String>(productCodes);
    }

    /**
     * <p>
     * One or more product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid
     * only when modifying the <code>productCodes</code> attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCodes(java.util.Collection)} or {@link #withProductCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes. After you add a product code to an AFI, it can't be removed. This parameter is
     *        valid only when modifying the <code>productCodes</code> attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFpgaImageAttributeRequest withProductCodes(String... productCodes) {
        if (this.productCodes == null) {
            setProductCodes(new com.amazonaws.internal.SdkInternalList<String>(productCodes.length));
        }
        for (String ele : productCodes) {
            this.productCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more product codes. After you add a product code to an AFI, it can't be removed. This parameter is valid
     * only when modifying the <code>productCodes</code> attribute.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes. After you add a product code to an AFI, it can't be removed. This parameter is
     *        valid only when modifying the <code>productCodes</code> attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFpgaImageAttributeRequest withProductCodes(java.util.Collection<String> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The load permission for the AFI.
     * </p>
     * 
     * @param loadPermission
     *        The load permission for the AFI.
     */

    public void setLoadPermission(LoadPermissionModifications loadPermission) {
        this.loadPermission = loadPermission;
    }

    /**
     * <p>
     * The load permission for the AFI.
     * </p>
     * 
     * @return The load permission for the AFI.
     */

    public LoadPermissionModifications getLoadPermission() {
        return this.loadPermission;
    }

    /**
     * <p>
     * The load permission for the AFI.
     * </p>
     * 
     * @param loadPermission
     *        The load permission for the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFpgaImageAttributeRequest withLoadPermission(LoadPermissionModifications loadPermission) {
        setLoadPermission(loadPermission);
        return this;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     * 
     * @param description
     *        A description for the AFI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     * 
     * @return A description for the AFI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the AFI.
     * </p>
     * 
     * @param description
     *        A description for the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFpgaImageAttributeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     * 
     * @param name
     *        A name for the AFI.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     * 
     * @return A name for the AFI.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the AFI.
     * </p>
     * 
     * @param name
     *        A name for the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFpgaImageAttributeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyFpgaImageAttributeRequest> getDryRunRequest() {
        Request<ModifyFpgaImageAttributeRequest> request = new ModifyFpgaImageAttributeRequestMarshaller().marshall(this);
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
        if (getFpgaImageId() != null)
            sb.append("FpgaImageId: ").append(getFpgaImageId()).append(",");
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getOperationType() != null)
            sb.append("OperationType: ").append(getOperationType()).append(",");
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds()).append(",");
        if (getUserGroups() != null)
            sb.append("UserGroups: ").append(getUserGroups()).append(",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: ").append(getProductCodes()).append(",");
        if (getLoadPermission() != null)
            sb.append("LoadPermission: ").append(getLoadPermission()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyFpgaImageAttributeRequest == false)
            return false;
        ModifyFpgaImageAttributeRequest other = (ModifyFpgaImageAttributeRequest) obj;
        if (other.getFpgaImageId() == null ^ this.getFpgaImageId() == null)
            return false;
        if (other.getFpgaImageId() != null && other.getFpgaImageId().equals(this.getFpgaImageId()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getOperationType() == null ^ this.getOperationType() == null)
            return false;
        if (other.getOperationType() != null && other.getOperationType().equals(this.getOperationType()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getUserGroups() == null ^ this.getUserGroups() == null)
            return false;
        if (other.getUserGroups() != null && other.getUserGroups().equals(this.getUserGroups()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getLoadPermission() == null ^ this.getLoadPermission() == null)
            return false;
        if (other.getLoadPermission() != null && other.getLoadPermission().equals(this.getLoadPermission()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgaImageId() == null) ? 0 : getFpgaImageId().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getUserGroups() == null) ? 0 : getUserGroups().hashCode());
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getLoadPermission() == null) ? 0 : getLoadPermission().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ModifyFpgaImageAttributeRequest clone() {
        return (ModifyFpgaImageAttributeRequest) super.clone();
    }
}
