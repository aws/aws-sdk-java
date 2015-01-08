/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyImageAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyImageAttribute(ModifyImageAttributeRequest) ModifyImageAttribute operation}.
 * <p>
 * Modifies the specified attribute of the specified AMI. You can specify
 * only one attribute at a time.
 * </p>
 * <p>
 * <b>NOTE:</b> AWS Marketplace product codes cannot be modified. Images
 * with an AWS Marketplace product code cannot be made public.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyImageAttribute(ModifyImageAttributeRequest)
 */
public class ModifyImageAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ModifyImageAttributeRequest> {

    /**
     * The ID of the AMI.
     */
    private String imageId;

    /**
     * The name of the attribute to modify.
     */
    private String attribute;

    /**
     * The operation type.
     */
    private String operationType;

    /**
     * One or more AWS account IDs. This is only valid when modifying the
     * <code>launchPermission</code> attribute.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> userIds;

    /**
     * One or more user groups. This is only valid when modifying the
     * <code>launchPermission</code> attribute.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> userGroups;

    /**
     * One or more product codes. After you add a product code to an AMI, it
     * can't be removed. This is only valid when modifying the
     * <code>productCodes</code> attribute.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> productCodes;

    /**
     * The value of the attribute being modified. This is only valid when
     * modifying the <code>description</code> attribute.
     */
    private String value;

    /**
     * <p/>
     */
    private LaunchPermissionModifications launchPermission;

    /**
     * A description for the AMI.
     */
    private String description;

    /**
     * Default constructor for a new ModifyImageAttributeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ModifyImageAttributeRequest() {}
    
    /**
     * Constructs a new ModifyImageAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param imageId The ID of the AMI.
     * @param attribute The name of the attribute to modify.
     */
    public ModifyImageAttributeRequest(String imageId, String attribute) {
        setImageId(imageId);
        setAttribute(attribute);
    }

    /**
     * The ID of the AMI.
     *
     * @return The ID of the AMI.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the AMI.
     *
     * @param imageId The ID of the AMI.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * The name of the attribute to modify.
     *
     * @return The name of the attribute to modify.
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute to modify.
     *
     * @param attribute The name of the attribute to modify.
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attribute The name of the attribute to modify.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * The operation type.
     *
     * @return The operation type.
     */
    public String getOperationType() {
        return operationType;
    }
    
    /**
     * The operation type.
     *
     * @param operationType The operation type.
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
    
    /**
     * The operation type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operationType The operation type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * One or more AWS account IDs. This is only valid when modifying the
     * <code>launchPermission</code> attribute.
     *
     * @return One or more AWS account IDs. This is only valid when modifying the
     *         <code>launchPermission</code> attribute.
     */
    public java.util.List<String> getUserIds() {
        if (userIds == null) {
              userIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              userIds.setAutoConstruct(true);
        }
        return userIds;
    }
    
    /**
     * One or more AWS account IDs. This is only valid when modifying the
     * <code>launchPermission</code> attribute.
     *
     * @param userIds One or more AWS account IDs. This is only valid when modifying the
     *         <code>launchPermission</code> attribute.
     */
    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> userIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(userIds.size());
        userIdsCopy.addAll(userIds);
        this.userIds = userIdsCopy;
    }
    
    /**
     * One or more AWS account IDs. This is only valid when modifying the
     * <code>launchPermission</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIds One or more AWS account IDs. This is only valid when modifying the
     *         <code>launchPermission</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withUserIds(String... userIds) {
        if (getUserIds() == null) setUserIds(new java.util.ArrayList<String>(userIds.length));
        for (String value : userIds) {
            getUserIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more AWS account IDs. This is only valid when modifying the
     * <code>launchPermission</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIds One or more AWS account IDs. This is only valid when modifying the
     *         <code>launchPermission</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> userIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(userIds.size());
            userIdsCopy.addAll(userIds);
            this.userIds = userIdsCopy;
        }

        return this;
    }

    /**
     * One or more user groups. This is only valid when modifying the
     * <code>launchPermission</code> attribute.
     *
     * @return One or more user groups. This is only valid when modifying the
     *         <code>launchPermission</code> attribute.
     */
    public java.util.List<String> getUserGroups() {
        if (userGroups == null) {
              userGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              userGroups.setAutoConstruct(true);
        }
        return userGroups;
    }
    
    /**
     * One or more user groups. This is only valid when modifying the
     * <code>launchPermission</code> attribute.
     *
     * @param userGroups One or more user groups. This is only valid when modifying the
     *         <code>launchPermission</code> attribute.
     */
    public void setUserGroups(java.util.Collection<String> userGroups) {
        if (userGroups == null) {
            this.userGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> userGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(userGroups.size());
        userGroupsCopy.addAll(userGroups);
        this.userGroups = userGroupsCopy;
    }
    
    /**
     * One or more user groups. This is only valid when modifying the
     * <code>launchPermission</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userGroups One or more user groups. This is only valid when modifying the
     *         <code>launchPermission</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withUserGroups(String... userGroups) {
        if (getUserGroups() == null) setUserGroups(new java.util.ArrayList<String>(userGroups.length));
        for (String value : userGroups) {
            getUserGroups().add(value);
        }
        return this;
    }
    
    /**
     * One or more user groups. This is only valid when modifying the
     * <code>launchPermission</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userGroups One or more user groups. This is only valid when modifying the
     *         <code>launchPermission</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withUserGroups(java.util.Collection<String> userGroups) {
        if (userGroups == null) {
            this.userGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> userGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(userGroups.size());
            userGroupsCopy.addAll(userGroups);
            this.userGroups = userGroupsCopy;
        }

        return this;
    }

    /**
     * One or more product codes. After you add a product code to an AMI, it
     * can't be removed. This is only valid when modifying the
     * <code>productCodes</code> attribute.
     *
     * @return One or more product codes. After you add a product code to an AMI, it
     *         can't be removed. This is only valid when modifying the
     *         <code>productCodes</code> attribute.
     */
    public java.util.List<String> getProductCodes() {
        if (productCodes == null) {
              productCodes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              productCodes.setAutoConstruct(true);
        }
        return productCodes;
    }
    
    /**
     * One or more product codes. After you add a product code to an AMI, it
     * can't be removed. This is only valid when modifying the
     * <code>productCodes</code> attribute.
     *
     * @param productCodes One or more product codes. After you add a product code to an AMI, it
     *         can't be removed. This is only valid when modifying the
     *         <code>productCodes</code> attribute.
     */
    public void setProductCodes(java.util.Collection<String> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> productCodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(productCodes.size());
        productCodesCopy.addAll(productCodes);
        this.productCodes = productCodesCopy;
    }
    
    /**
     * One or more product codes. After you add a product code to an AMI, it
     * can't be removed. This is only valid when modifying the
     * <code>productCodes</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes One or more product codes. After you add a product code to an AMI, it
     *         can't be removed. This is only valid when modifying the
     *         <code>productCodes</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withProductCodes(String... productCodes) {
        if (getProductCodes() == null) setProductCodes(new java.util.ArrayList<String>(productCodes.length));
        for (String value : productCodes) {
            getProductCodes().add(value);
        }
        return this;
    }
    
    /**
     * One or more product codes. After you add a product code to an AMI, it
     * can't be removed. This is only valid when modifying the
     * <code>productCodes</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes One or more product codes. After you add a product code to an AMI, it
     *         can't be removed. This is only valid when modifying the
     *         <code>productCodes</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withProductCodes(java.util.Collection<String> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> productCodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(productCodes.size());
            productCodesCopy.addAll(productCodes);
            this.productCodes = productCodesCopy;
        }

        return this;
    }

    /**
     * The value of the attribute being modified. This is only valid when
     * modifying the <code>description</code> attribute.
     *
     * @return The value of the attribute being modified. This is only valid when
     *         modifying the <code>description</code> attribute.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value of the attribute being modified. This is only valid when
     * modifying the <code>description</code> attribute.
     *
     * @param value The value of the attribute being modified. This is only valid when
     *         modifying the <code>description</code> attribute.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value of the attribute being modified. This is only valid when
     * modifying the <code>description</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value of the attribute being modified. This is only valid when
     *         modifying the <code>description</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public LaunchPermissionModifications getLaunchPermission() {
        return launchPermission;
    }
    
    /**
     * <p/>
     *
     * @param launchPermission <p/>
     */
    public void setLaunchPermission(LaunchPermissionModifications launchPermission) {
        this.launchPermission = launchPermission;
    }
    
    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchPermission <p/>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withLaunchPermission(LaunchPermissionModifications launchPermission) {
        this.launchPermission = launchPermission;
        return this;
    }

    /**
     * A description for the AMI.
     *
     * @return A description for the AMI.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the AMI.
     *
     * @param description A description for the AMI.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyImageAttributeRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ModifyImageAttributeRequest> getDryRunRequest() {
        Request<ModifyImageAttributeRequest> request = new ModifyImageAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getAttribute() != null) sb.append("Attribute: " + getAttribute() + ",");
        if (getOperationType() != null) sb.append("OperationType: " + getOperationType() + ",");
        if (getUserIds() != null) sb.append("UserIds: " + getUserIds() + ",");
        if (getUserGroups() != null) sb.append("UserGroups: " + getUserGroups() + ",");
        if (getProductCodes() != null) sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getLaunchPermission() != null) sb.append("LaunchPermission: " + getLaunchPermission() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyImageAttributeRequest == false) return false;
        ModifyImageAttributeRequest other = (ModifyImageAttributeRequest)obj;
        
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getAttribute() == null ^ this.getAttribute() == null) return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false) return false; 
        if (other.getOperationType() == null ^ this.getOperationType() == null) return false;
        if (other.getOperationType() != null && other.getOperationType().equals(this.getOperationType()) == false) return false; 
        if (other.getUserIds() == null ^ this.getUserIds() == null) return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false) return false; 
        if (other.getUserGroups() == null ^ this.getUserGroups() == null) return false;
        if (other.getUserGroups() != null && other.getUserGroups().equals(this.getUserGroups()) == false) return false; 
        if (other.getProductCodes() == null ^ this.getProductCodes() == null) return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getLaunchPermission() == null ^ this.getLaunchPermission() == null) return false;
        if (other.getLaunchPermission() != null && other.getLaunchPermission().equals(this.getLaunchPermission()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    