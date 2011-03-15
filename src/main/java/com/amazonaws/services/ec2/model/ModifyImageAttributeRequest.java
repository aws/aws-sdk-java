/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyImageAttribute(ModifyImageAttributeRequest) ModifyImageAttribute operation}.
 * <p>
 * The ModifyImageAttribute operation modifies an attribute of an AMI.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyImageAttribute(ModifyImageAttributeRequest)
 */
public class ModifyImageAttributeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the AMI whose attribute you want to modify.
     */
    private String imageId;

    /**
     * The name of the AMI attribute you want to modify. <p> Available
     * attributes: <code>launchPermission</code>, <code>productCodes</code>
     */
    private String attribute;

    /**
     * The type of operation being requested. <p> Available operation types:
     * <code>add</code>, <code>remove</code>
     */
    private String operationType;

    /**
     * The AWS user ID being added to or removed from the list of users with
     * launch permissions for this AMI. Only valid when the launchPermission
     * attribute is being modified.
     */
    private java.util.List<String> userIds;

    /**
     * The user group being added to or removed from the list of user groups
     * with launch permissions for this AMI. Only valid when the
     * launchPermission attribute is being modified. <p> Available user
     * groups: <code>all</code>
     */
    private java.util.List<String> userGroups;

    /**
     * The list of product codes being added to or removed from the specified
     * AMI. Only valid when the productCodes attribute is being modified.
     */
    private java.util.List<String> productCodes;

    /**
     * The value of the attribute being modified. Only valid when the
     * description attribute is being modified.
     */
    private String value;

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
     * @param imageId The ID of the AMI whose attribute you want to modify.
     * @param attribute The name of the AMI attribute you want to modify. <p>
     * Available attributes: <code>launchPermission</code>,
     * <code>productCodes</code>
     */
    public ModifyImageAttributeRequest(String imageId, String attribute) {
        this.imageId = imageId;
        this.attribute = attribute;
    }
    
    /**
     * The ID of the AMI whose attribute you want to modify.
     *
     * @return The ID of the AMI whose attribute you want to modify.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the AMI whose attribute you want to modify.
     *
     * @param imageId The ID of the AMI whose attribute you want to modify.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the AMI whose attribute you want to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the AMI whose attribute you want to modify.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyImageAttributeRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    
    
    /**
     * The name of the AMI attribute you want to modify. <p> Available
     * attributes: <code>launchPermission</code>, <code>productCodes</code>
     *
     * @return The name of the AMI attribute you want to modify. <p> Available
     *         attributes: <code>launchPermission</code>, <code>productCodes</code>
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the AMI attribute you want to modify. <p> Available
     * attributes: <code>launchPermission</code>, <code>productCodes</code>
     *
     * @param attribute The name of the AMI attribute you want to modify. <p> Available
     *         attributes: <code>launchPermission</code>, <code>productCodes</code>
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the AMI attribute you want to modify. <p> Available
     * attributes: <code>launchPermission</code>, <code>productCodes</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attribute The name of the AMI attribute you want to modify. <p> Available
     *         attributes: <code>launchPermission</code>, <code>productCodes</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyImageAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    
    
    /**
     * The type of operation being requested. <p> Available operation types:
     * <code>add</code>, <code>remove</code>
     *
     * @return The type of operation being requested. <p> Available operation types:
     *         <code>add</code>, <code>remove</code>
     */
    public String getOperationType() {
        return operationType;
    }
    
    /**
     * The type of operation being requested. <p> Available operation types:
     * <code>add</code>, <code>remove</code>
     *
     * @param operationType The type of operation being requested. <p> Available operation types:
     *         <code>add</code>, <code>remove</code>
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
    
    /**
     * The type of operation being requested. <p> Available operation types:
     * <code>add</code>, <code>remove</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param operationType The type of operation being requested. <p> Available operation types:
     *         <code>add</code>, <code>remove</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyImageAttributeRequest withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    
    
    /**
     * The AWS user ID being added to or removed from the list of users with
     * launch permissions for this AMI. Only valid when the launchPermission
     * attribute is being modified.
     *
     * @return The AWS user ID being added to or removed from the list of users with
     *         launch permissions for this AMI. Only valid when the launchPermission
     *         attribute is being modified.
     */
    public java.util.List<String> getUserIds() {
        if (userIds == null) {
            userIds = new java.util.ArrayList<String>();
        }
        return userIds;
    }
    
    /**
     * The AWS user ID being added to or removed from the list of users with
     * launch permissions for this AMI. Only valid when the launchPermission
     * attribute is being modified.
     *
     * @param userIds The AWS user ID being added to or removed from the list of users with
     *         launch permissions for this AMI. Only valid when the launchPermission
     *         attribute is being modified.
     */
    public void setUserIds(java.util.Collection<String> userIds) {
        java.util.List<String> userIdsCopy = new java.util.ArrayList<String>();
        if (userIds != null) {
            userIdsCopy.addAll(userIds);
        }
        this.userIds = userIdsCopy;
    }
    
    /**
     * The AWS user ID being added to or removed from the list of users with
     * launch permissions for this AMI. Only valid when the launchPermission
     * attribute is being modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIds The AWS user ID being added to or removed from the list of users with
     *         launch permissions for this AMI. Only valid when the launchPermission
     *         attribute is being modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyImageAttributeRequest withUserIds(String... userIds) {
        for (String value : userIds) {
            getUserIds().add(value);
        }
        return this;
    }
    
    /**
     * The AWS user ID being added to or removed from the list of users with
     * launch permissions for this AMI. Only valid when the launchPermission
     * attribute is being modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIds The AWS user ID being added to or removed from the list of users with
     *         launch permissions for this AMI. Only valid when the launchPermission
     *         attribute is being modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyImageAttributeRequest withUserIds(java.util.Collection<String> userIds) {
        java.util.List<String> userIdsCopy = new java.util.ArrayList<String>();
        if (userIds != null) {
            userIdsCopy.addAll(userIds);
        }
        this.userIds = userIdsCopy;

        return this;
    }
    
    /**
     * The user group being added to or removed from the list of user groups
     * with launch permissions for this AMI. Only valid when the
     * launchPermission attribute is being modified. <p> Available user
     * groups: <code>all</code>
     *
     * @return The user group being added to or removed from the list of user groups
     *         with launch permissions for this AMI. Only valid when the
     *         launchPermission attribute is being modified. <p> Available user
     *         groups: <code>all</code>
     */
    public java.util.List<String> getUserGroups() {
        if (userGroups == null) {
            userGroups = new java.util.ArrayList<String>();
        }
        return userGroups;
    }
    
    /**
     * The user group being added to or removed from the list of user groups
     * with launch permissions for this AMI. Only valid when the
     * launchPermission attribute is being modified. <p> Available user
     * groups: <code>all</code>
     *
     * @param userGroups The user group being added to or removed from the list of user groups
     *         with launch permissions for this AMI. Only valid when the
     *         launchPermission attribute is being modified. <p> Available user
     *         groups: <code>all</code>
     */
    public void setUserGroups(java.util.Collection<String> userGroups) {
        java.util.List<String> userGroupsCopy = new java.util.ArrayList<String>();
        if (userGroups != null) {
            userGroupsCopy.addAll(userGroups);
        }
        this.userGroups = userGroupsCopy;
    }
    
    /**
     * The user group being added to or removed from the list of user groups
     * with launch permissions for this AMI. Only valid when the
     * launchPermission attribute is being modified. <p> Available user
     * groups: <code>all</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userGroups The user group being added to or removed from the list of user groups
     *         with launch permissions for this AMI. Only valid when the
     *         launchPermission attribute is being modified. <p> Available user
     *         groups: <code>all</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyImageAttributeRequest withUserGroups(String... userGroups) {
        for (String value : userGroups) {
            getUserGroups().add(value);
        }
        return this;
    }
    
    /**
     * The user group being added to or removed from the list of user groups
     * with launch permissions for this AMI. Only valid when the
     * launchPermission attribute is being modified. <p> Available user
     * groups: <code>all</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userGroups The user group being added to or removed from the list of user groups
     *         with launch permissions for this AMI. Only valid when the
     *         launchPermission attribute is being modified. <p> Available user
     *         groups: <code>all</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyImageAttributeRequest withUserGroups(java.util.Collection<String> userGroups) {
        java.util.List<String> userGroupsCopy = new java.util.ArrayList<String>();
        if (userGroups != null) {
            userGroupsCopy.addAll(userGroups);
        }
        this.userGroups = userGroupsCopy;

        return this;
    }
    
    /**
     * The list of product codes being added to or removed from the specified
     * AMI. Only valid when the productCodes attribute is being modified.
     *
     * @return The list of product codes being added to or removed from the specified
     *         AMI. Only valid when the productCodes attribute is being modified.
     */
    public java.util.List<String> getProductCodes() {
        if (productCodes == null) {
            productCodes = new java.util.ArrayList<String>();
        }
        return productCodes;
    }
    
    /**
     * The list of product codes being added to or removed from the specified
     * AMI. Only valid when the productCodes attribute is being modified.
     *
     * @param productCodes The list of product codes being added to or removed from the specified
     *         AMI. Only valid when the productCodes attribute is being modified.
     */
    public void setProductCodes(java.util.Collection<String> productCodes) {
        java.util.List<String> productCodesCopy = new java.util.ArrayList<String>();
        if (productCodes != null) {
            productCodesCopy.addAll(productCodes);
        }
        this.productCodes = productCodesCopy;
    }
    
    /**
     * The list of product codes being added to or removed from the specified
     * AMI. Only valid when the productCodes attribute is being modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes The list of product codes being added to or removed from the specified
     *         AMI. Only valid when the productCodes attribute is being modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyImageAttributeRequest withProductCodes(String... productCodes) {
        for (String value : productCodes) {
            getProductCodes().add(value);
        }
        return this;
    }
    
    /**
     * The list of product codes being added to or removed from the specified
     * AMI. Only valid when the productCodes attribute is being modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes The list of product codes being added to or removed from the specified
     *         AMI. Only valid when the productCodes attribute is being modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyImageAttributeRequest withProductCodes(java.util.Collection<String> productCodes) {
        java.util.List<String> productCodesCopy = new java.util.ArrayList<String>();
        if (productCodes != null) {
            productCodesCopy.addAll(productCodes);
        }
        this.productCodes = productCodesCopy;

        return this;
    }
    
    /**
     * The value of the attribute being modified. Only valid when the
     * description attribute is being modified.
     *
     * @return The value of the attribute being modified. Only valid when the
     *         description attribute is being modified.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value of the attribute being modified. Only valid when the
     * description attribute is being modified.
     *
     * @param value The value of the attribute being modified. Only valid when the
     *         description attribute is being modified.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value of the attribute being modified. Only valid when the
     * description attribute is being modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The value of the attribute being modified. Only valid when the
     *         description attribute is being modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyImageAttributeRequest withValue(String value) {
        this.value = value;
        return this;
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
        sb.append("ImageId: " + imageId + ", ");
        sb.append("Attribute: " + attribute + ", ");
        sb.append("OperationType: " + operationType + ", ");
        sb.append("UserIds: " + userIds + ", ");
        sb.append("UserGroups: " + userGroups + ", ");
        sb.append("ProductCodes: " + productCodes + ", ");
        sb.append("Value: " + value + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    