/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeImages(DescribeImagesRequest) DescribeImages operation}.
 * <p>
 * The DescribeImages operation returns information about AMIs, AKIs, and ARIs available to the user. Information returned includes image type, product
 * codes, architecture, and kernel and RAM disk IDs. Images available to the user include public images available for any user to launch, private images
 * owned by the user making the request, and private images owned by other users for which the user has explicit launch permissions.
 * </p>
 * <p>
 * Launch permissions fall into three categories:
 * </p>
 * 
 * <ul>
 * <li> <b>Public:</b> The owner of the AMI granted launch permissions for the AMI to the all group. All users have launch permissions for these AMIs.
 * </li>
 * <li> <b>Explicit:</b> The owner of the AMI granted launch permissions to a specific user. </li>
 * <li> <b>Implicit:</b> A user has implicit launch permissions for all AMIs he or she owns. </li>
 * 
 * </ul>
 * <p>
 * The list of AMIs returned can be modified by specifying AMI IDs, AMI owners, or users with launch permissions. If no options are specified, Amazon
 * EC2 returns all AMIs for which the user has launch permissions.
 * </p>
 * <p>
 * If you specify one or more AMI IDs, only AMIs that have the specified IDs are returned. If you specify an invalid AMI ID, a fault is returned. If you
 * specify an AMI ID for which you do not have access, it will not be included in the returned results.
 * </p>
 * <p>
 * If you specify one or more AMI owners, only AMIs from the specified owners and for which you have access are returned. The results can include the
 * account IDs of the specified owners, amazon for AMIs owned by Amazon or self for AMIs that you own.
 * </p>
 * <p>
 * If you specify a list of executable users, only users that have launch permissions for the AMIs are returned. You can specify account IDs (if you own
 * the AMI(s)), self for AMIs for which you own or have explicit permissions, or all for public AMIs.
 * </p>
 * <p>
 * <b>NOTE:</b> Deregistered images are included in the returned results for an unspecified interval after deregistration.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeImages(DescribeImagesRequest)
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
     * A list of filters used to match properties for Images. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

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
        if (imageIds == null) {
            this.imageIds = null;
            return;
        }

        java.util.List<String> imageIdsCopy = new java.util.ArrayList<String>(imageIds.size());
        imageIdsCopy.addAll(imageIds);
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
        if (getImageIds() == null) setImageIds(new java.util.ArrayList<String>(imageIds.length));
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
        if (imageIds == null) {
            this.imageIds = null;
        } else {
            java.util.List<String> imageIdsCopy = new java.util.ArrayList<String>(imageIds.size());
            imageIdsCopy.addAll(imageIds);
            this.imageIds = imageIdsCopy;
        }

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
        if (owners == null) {
            this.owners = null;
            return;
        }

        java.util.List<String> ownersCopy = new java.util.ArrayList<String>(owners.size());
        ownersCopy.addAll(owners);
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
        if (getOwners() == null) setOwners(new java.util.ArrayList<String>(owners.length));
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
        if (owners == null) {
            this.owners = null;
        } else {
            java.util.List<String> ownersCopy = new java.util.ArrayList<String>(owners.size());
            ownersCopy.addAll(owners);
            this.owners = ownersCopy;
        }

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
        if (executableUsers == null) {
            this.executableUsers = null;
            return;
        }

        java.util.List<String> executableUsersCopy = new java.util.ArrayList<String>(executableUsers.size());
        executableUsersCopy.addAll(executableUsers);
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
        if (getExecutableUsers() == null) setExecutableUsers(new java.util.ArrayList<String>(executableUsers.length));
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
        if (executableUsers == null) {
            this.executableUsers = null;
        } else {
            java.util.List<String> executableUsersCopy = new java.util.ArrayList<String>(executableUsers.size());
            executableUsersCopy.addAll(executableUsers);
            this.executableUsers = executableUsersCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for Images. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Images. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for Images. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Images. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for Images. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Images. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImagesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Images. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Images. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeImagesRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

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
        if (imageIds != null) sb.append("ImageIds: " + imageIds + ", ");
        if (owners != null) sb.append("Owners: " + owners + ", ");
        if (executableUsers != null) sb.append("ExecutableUsers: " + executableUsers + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageIds() == null) ? 0 : getImageIds().hashCode()); 
        hashCode = prime * hashCode + ((getOwners() == null) ? 0 : getOwners().hashCode()); 
        hashCode = prime * hashCode + ((getExecutableUsers() == null) ? 0 : getExecutableUsers().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeImagesRequest == false) return false;
        DescribeImagesRequest other = (DescribeImagesRequest)obj;
        
        if (other.getImageIds() == null ^ this.getImageIds() == null) return false;
        if (other.getImageIds() != null && other.getImageIds().equals(this.getImageIds()) == false) return false; 
        if (other.getOwners() == null ^ this.getOwners() == null) return false;
        if (other.getOwners() != null && other.getOwners().equals(this.getOwners()) == false) return false; 
        if (other.getExecutableUsers() == null ^ this.getExecutableUsers() == null) return false;
        if (other.getExecutableUsers() != null && other.getExecutableUsers().equals(this.getExecutableUsers()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    