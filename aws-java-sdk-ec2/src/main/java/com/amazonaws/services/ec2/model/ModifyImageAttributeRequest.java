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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyImageAttributeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ModifyImageAttribute.
 * </p>
 */
public class ModifyImageAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyImageAttributeRequest> {

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the attribute to modify.
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
     * One or more AWS account IDs. This is only valid when modifying the <code>launchPermission</code> attribute.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userIds;
    /**
     * <p>
     * One or more user groups. This is only valid when modifying the <code>launchPermission</code> attribute.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> userGroups;
    /**
     * <p>
     * One or more product codes. After you add a product code to an AMI, it can't be removed. This is only valid when
     * modifying the <code>productCodes</code> attribute.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> productCodes;
    /**
     * <p>
     * The value of the attribute being modified. This is only valid when modifying the <code>description</code>
     * attribute.
     * </p>
     */
    private String value;
    /**
     * <p>
     * A launch permission modification.
     * </p>
     */
    private LaunchPermissionModifications launchPermission;
    /**
     * <p>
     * A description for the AMI.
     * </p>
     */
    private String description;

    /**
     * Default constructor for ModifyImageAttributeRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ModifyImageAttributeRequest() {
    }

    /**
     * Constructs a new ModifyImageAttributeRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param imageId
     *        The ID of the AMI.
     * @param attribute
     *        The name of the attribute to modify.
     */
    public ModifyImageAttributeRequest(String imageId, String attribute) {
        setImageId(imageId);
        setAttribute(attribute);
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @return The ID of the AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The name of the attribute to modify.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute to modify.
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The name of the attribute to modify.
     * </p>
     * 
     * @return The name of the attribute to modify.
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The name of the attribute to modify.
     * </p>
     * 
     * @param attribute
     *        The name of the attribute to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
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

    public ModifyImageAttributeRequest withOperationType(String operationType) {
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
     * @see OperationType
     */

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType.toString();
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

    public ModifyImageAttributeRequest withOperationType(OperationType operationType) {
        setOperationType(operationType);
        return this;
    }

    /**
     * <p>
     * One or more AWS account IDs. This is only valid when modifying the <code>launchPermission</code> attribute.
     * </p>
     * 
     * @return One or more AWS account IDs. This is only valid when modifying the <code>launchPermission</code>
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
     * One or more AWS account IDs. This is only valid when modifying the <code>launchPermission</code> attribute.
     * </p>
     * 
     * @param userIds
     *        One or more AWS account IDs. This is only valid when modifying the <code>launchPermission</code>
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
     * One or more AWS account IDs. This is only valid when modifying the <code>launchPermission</code> attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        One or more AWS account IDs. This is only valid when modifying the <code>launchPermission</code>
     *        attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withUserIds(String... userIds) {
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
     * One or more AWS account IDs. This is only valid when modifying the <code>launchPermission</code> attribute.
     * </p>
     * 
     * @param userIds
     *        One or more AWS account IDs. This is only valid when modifying the <code>launchPermission</code>
     *        attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * One or more user groups. This is only valid when modifying the <code>launchPermission</code> attribute.
     * </p>
     * 
     * @return One or more user groups. This is only valid when modifying the <code>launchPermission</code> attribute.
     */

    public java.util.List<String> getUserGroups() {
        if (userGroups == null) {
            userGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return userGroups;
    }

    /**
     * <p>
     * One or more user groups. This is only valid when modifying the <code>launchPermission</code> attribute.
     * </p>
     * 
     * @param userGroups
     *        One or more user groups. This is only valid when modifying the <code>launchPermission</code> attribute.
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
     * One or more user groups. This is only valid when modifying the <code>launchPermission</code> attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserGroups(java.util.Collection)} or {@link #withUserGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userGroups
     *        One or more user groups. This is only valid when modifying the <code>launchPermission</code> attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withUserGroups(String... userGroups) {
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
     * One or more user groups. This is only valid when modifying the <code>launchPermission</code> attribute.
     * </p>
     * 
     * @param userGroups
     *        One or more user groups. This is only valid when modifying the <code>launchPermission</code> attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withUserGroups(java.util.Collection<String> userGroups) {
        setUserGroups(userGroups);
        return this;
    }

    /**
     * <p>
     * One or more product codes. After you add a product code to an AMI, it can't be removed. This is only valid when
     * modifying the <code>productCodes</code> attribute.
     * </p>
     * 
     * @return One or more product codes. After you add a product code to an AMI, it can't be removed. This is only
     *         valid when modifying the <code>productCodes</code> attribute.
     */

    public java.util.List<String> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return productCodes;
    }

    /**
     * <p>
     * One or more product codes. After you add a product code to an AMI, it can't be removed. This is only valid when
     * modifying the <code>productCodes</code> attribute.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes. After you add a product code to an AMI, it can't be removed. This is only valid
     *        when modifying the <code>productCodes</code> attribute.
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
     * One or more product codes. After you add a product code to an AMI, it can't be removed. This is only valid when
     * modifying the <code>productCodes</code> attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCodes(java.util.Collection)} or {@link #withProductCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes. After you add a product code to an AMI, it can't be removed. This is only valid
     *        when modifying the <code>productCodes</code> attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withProductCodes(String... productCodes) {
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
     * One or more product codes. After you add a product code to an AMI, it can't be removed. This is only valid when
     * modifying the <code>productCodes</code> attribute.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes. After you add a product code to an AMI, it can't be removed. This is only valid
     *        when modifying the <code>productCodes</code> attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withProductCodes(java.util.Collection<String> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The value of the attribute being modified. This is only valid when modifying the <code>description</code>
     * attribute.
     * </p>
     * 
     * @param value
     *        The value of the attribute being modified. This is only valid when modifying the <code>description</code>
     *        attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the attribute being modified. This is only valid when modifying the <code>description</code>
     * attribute.
     * </p>
     * 
     * @return The value of the attribute being modified. This is only valid when modifying the <code>description</code>
     *         attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the attribute being modified. This is only valid when modifying the <code>description</code>
     * attribute.
     * </p>
     * 
     * @param value
     *        The value of the attribute being modified. This is only valid when modifying the <code>description</code>
     *        attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * A launch permission modification.
     * </p>
     * 
     * @param launchPermission
     *        A launch permission modification.
     */

    public void setLaunchPermission(LaunchPermissionModifications launchPermission) {
        this.launchPermission = launchPermission;
    }

    /**
     * <p>
     * A launch permission modification.
     * </p>
     * 
     * @return A launch permission modification.
     */

    public LaunchPermissionModifications getLaunchPermission() {
        return this.launchPermission;
    }

    /**
     * <p>
     * A launch permission modification.
     * </p>
     * 
     * @param launchPermission
     *        A launch permission modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withLaunchPermission(LaunchPermissionModifications launchPermission) {
        setLaunchPermission(launchPermission);
        return this;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     * 
     * @param description
     *        A description for the AMI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     * 
     * @return A description for the AMI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     * 
     * @param description
     *        A description for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyImageAttributeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyImageAttributeRequest> getDryRunRequest() {
        Request<ModifyImageAttributeRequest> request = new ModifyImageAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute() + ",");
        if (getOperationType() != null)
            sb.append("OperationType: " + getOperationType() + ",");
        if (getUserIds() != null)
            sb.append("UserIds: " + getUserIds() + ",");
        if (getUserGroups() != null)
            sb.append("UserGroups: " + getUserGroups() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getLaunchPermission() != null)
            sb.append("LaunchPermission: " + getLaunchPermission() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyImageAttributeRequest == false)
            return false;
        ModifyImageAttributeRequest other = (ModifyImageAttributeRequest) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
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
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getLaunchPermission() == null ^ this.getLaunchPermission() == null)
            return false;
        if (other.getLaunchPermission() != null && other.getLaunchPermission().equals(this.getLaunchPermission()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getOperationType() == null) ? 0 : getOperationType().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode + ((getUserGroups() == null) ? 0 : getUserGroups().hashCode());
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getLaunchPermission() == null) ? 0 : getLaunchPermission().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ModifyImageAttributeRequest clone() {
        return (ModifyImageAttributeRequest) super.clone();
    }
}
