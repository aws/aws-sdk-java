/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * A request to describe the available <i>Amazon Machine Images</i>
 * (AMIs).
 * </p>
 */
public class DescribeImagesRequest extends AmazonWebServiceRequest {

    /**
     * An optional list of the AMI IDs to describe. If not specified, all
     * AMIs will be described.
     */
    private java.util.List<String> imageIds;

    /**
     * The optional list of owners for the described AMIs. The IDs amazon,
     * self, and explicit can be used to include AMIs owned by Amazon, AMIs
     * owned by the user, and AMIs for which the user has explicit launch
     * permissions, respectively.
     */
    private java.util.List<String> owners;

    /**
     * The optional list of users with explicit launch permissions for the
     * described AMIs. The user ID can be a user's account ID, 'self' to
     * return AMIs for which the sender of the request has explicit launch
     * permissions, or 'all' to return AMIs with public launch permissions.
     */
    private java.util.List<String> executableUsers;

    /**
     * An optional list of the AMI IDs to describe. If not specified, all
     * AMIs will be described.
     *
     * @return An optional list of the AMI IDs to describe. If not specified, all
     *         AMIs will be described.
     */
    public java.util.List<String> getImageIds() {
        if (imageIds == null) {
            imageIds = new java.util.ArrayList<String>();
        }
        return imageIds;
    }
    
    /**
     * An optional list of the AMI IDs to describe. If not specified, all
     * AMIs will be described.
     *
     * @param imageIds An optional list of the AMI IDs to describe. If not specified, all
     *         AMIs will be described.
     */
    public void setImageIds(java.util.Collection<String> imageIds) {
        java.util.List<String> imageIdsCopy = new java.util.ArrayList<String>();
        if (imageIds != null) {
            imageIdsCopy.addAll(imageIds);
        }
        this.imageIds = imageIdsCopy;
    }
    
    /**
     * An optional list of the AMI IDs to describe. If not specified, all
     * AMIs will be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageIds An optional list of the AMI IDs to describe. If not specified, all
     *         AMIs will be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImagesRequest withImageIds(String... imageIds) {
        for (String value : imageIds) {
            getImageIds().add(value);
        }
        return this;
    }
    
    /**
     * An optional list of the AMI IDs to describe. If not specified, all
     * AMIs will be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageIds An optional list of the AMI IDs to describe. If not specified, all
     *         AMIs will be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImagesRequest withImageIds(java.util.Collection<String> imageIds) {
        java.util.List<String> imageIdsCopy = new java.util.ArrayList<String>();
        if (imageIds != null) {
            imageIdsCopy.addAll(imageIds);
        }
        this.imageIds = imageIdsCopy;

        return this;
    }
    
    /**
     * The optional list of owners for the described AMIs. The IDs amazon,
     * self, and explicit can be used to include AMIs owned by Amazon, AMIs
     * owned by the user, and AMIs for which the user has explicit launch
     * permissions, respectively.
     *
     * @return The optional list of owners for the described AMIs. The IDs amazon,
     *         self, and explicit can be used to include AMIs owned by Amazon, AMIs
     *         owned by the user, and AMIs for which the user has explicit launch
     *         permissions, respectively.
     */
    public java.util.List<String> getOwners() {
        if (owners == null) {
            owners = new java.util.ArrayList<String>();
        }
        return owners;
    }
    
    /**
     * The optional list of owners for the described AMIs. The IDs amazon,
     * self, and explicit can be used to include AMIs owned by Amazon, AMIs
     * owned by the user, and AMIs for which the user has explicit launch
     * permissions, respectively.
     *
     * @param owners The optional list of owners for the described AMIs. The IDs amazon,
     *         self, and explicit can be used to include AMIs owned by Amazon, AMIs
     *         owned by the user, and AMIs for which the user has explicit launch
     *         permissions, respectively.
     */
    public void setOwners(java.util.Collection<String> owners) {
        java.util.List<String> ownersCopy = new java.util.ArrayList<String>();
        if (owners != null) {
            ownersCopy.addAll(owners);
        }
        this.owners = ownersCopy;
    }
    
    /**
     * The optional list of owners for the described AMIs. The IDs amazon,
     * self, and explicit can be used to include AMIs owned by Amazon, AMIs
     * owned by the user, and AMIs for which the user has explicit launch
     * permissions, respectively.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owners The optional list of owners for the described AMIs. The IDs amazon,
     *         self, and explicit can be used to include AMIs owned by Amazon, AMIs
     *         owned by the user, and AMIs for which the user has explicit launch
     *         permissions, respectively.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImagesRequest withOwners(String... owners) {
        for (String value : owners) {
            getOwners().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of owners for the described AMIs. The IDs amazon,
     * self, and explicit can be used to include AMIs owned by Amazon, AMIs
     * owned by the user, and AMIs for which the user has explicit launch
     * permissions, respectively.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owners The optional list of owners for the described AMIs. The IDs amazon,
     *         self, and explicit can be used to include AMIs owned by Amazon, AMIs
     *         owned by the user, and AMIs for which the user has explicit launch
     *         permissions, respectively.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImagesRequest withOwners(java.util.Collection<String> owners) {
        java.util.List<String> ownersCopy = new java.util.ArrayList<String>();
        if (owners != null) {
            ownersCopy.addAll(owners);
        }
        this.owners = ownersCopy;

        return this;
    }
    
    /**
     * The optional list of users with explicit launch permissions for the
     * described AMIs. The user ID can be a user's account ID, 'self' to
     * return AMIs for which the sender of the request has explicit launch
     * permissions, or 'all' to return AMIs with public launch permissions.
     *
     * @return The optional list of users with explicit launch permissions for the
     *         described AMIs. The user ID can be a user's account ID, 'self' to
     *         return AMIs for which the sender of the request has explicit launch
     *         permissions, or 'all' to return AMIs with public launch permissions.
     */
    public java.util.List<String> getExecutableUsers() {
        if (executableUsers == null) {
            executableUsers = new java.util.ArrayList<String>();
        }
        return executableUsers;
    }
    
    /**
     * The optional list of users with explicit launch permissions for the
     * described AMIs. The user ID can be a user's account ID, 'self' to
     * return AMIs for which the sender of the request has explicit launch
     * permissions, or 'all' to return AMIs with public launch permissions.
     *
     * @param executableUsers The optional list of users with explicit launch permissions for the
     *         described AMIs. The user ID can be a user's account ID, 'self' to
     *         return AMIs for which the sender of the request has explicit launch
     *         permissions, or 'all' to return AMIs with public launch permissions.
     */
    public void setExecutableUsers(java.util.Collection<String> executableUsers) {
        java.util.List<String> executableUsersCopy = new java.util.ArrayList<String>();
        if (executableUsers != null) {
            executableUsersCopy.addAll(executableUsers);
        }
        this.executableUsers = executableUsersCopy;
    }
    
    /**
     * The optional list of users with explicit launch permissions for the
     * described AMIs. The user ID can be a user's account ID, 'self' to
     * return AMIs for which the sender of the request has explicit launch
     * permissions, or 'all' to return AMIs with public launch permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executableUsers The optional list of users with explicit launch permissions for the
     *         described AMIs. The user ID can be a user's account ID, 'self' to
     *         return AMIs for which the sender of the request has explicit launch
     *         permissions, or 'all' to return AMIs with public launch permissions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImagesRequest withExecutableUsers(String... executableUsers) {
        for (String value : executableUsers) {
            getExecutableUsers().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of users with explicit launch permissions for the
     * described AMIs. The user ID can be a user's account ID, 'self' to
     * return AMIs for which the sender of the request has explicit launch
     * permissions, or 'all' to return AMIs with public launch permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executableUsers The optional list of users with explicit launch permissions for the
     *         described AMIs. The user ID can be a user's account ID, 'self' to
     *         return AMIs for which the sender of the request has explicit launch
     *         permissions, or 'all' to return AMIs with public launch permissions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImagesRequest withExecutableUsers(java.util.Collection<String> executableUsers) {
        java.util.List<String> executableUsersCopy = new java.util.ArrayList<String>();
        if (executableUsers != null) {
            executableUsersCopy.addAll(executableUsers);
        }
        this.executableUsers = executableUsersCopy;

        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("ImageIds: " + imageIds + ", ");
        sb.append("Owners: " + owners + ", ");
        sb.append("ExecutableUsers: " + executableUsers + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    