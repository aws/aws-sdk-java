/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeImagesRequestMarshaller;

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
public class DescribeImagesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeImagesRequest> {

    /**
     * An optional list of the AMI IDs to describe. If not specified, all
     * AMIs will be described.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> imageIds;

    /**
     * An optional list of owners by which to scope the described AMIs. Valid
     * values are: <ul> <li> <code>self</code> : AMIs owned by you </li> <li>
     * <i>AWS account ID</i> : AMIs owned by this account ID </li> <li>
     * <code>aws-marketplace</code> : AMIs owned by the AWS Marketplace </li>
     * <li> <code>amazon</code> : AMIs owned by Amazon </li> <li>
     * <code>all</code> : Do not scope the AMIs returned by owner </li> </ul>
     * <p> The values <code>self</code>, <code>aws-marketplace</code>,
     * <code>amazon</code>, and <code>all</code> are literals.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> owners;

    /**
     * An optional list of users whose launch permissions will be used to
     * scope the described AMIs. Valid values are: <ul> <li>
     * <code>self</code> : AMIs for which you have explicit launch
     * permissions </li> <li> <code>AWS account ID</code> : AMIs for which
     * this account ID has launch permissions </li> <li> <code>all</code> :
     * AMIs that have public launch permissions </li> </ul> <p> The values
     * <code>self</code> and <code>all</code> are literals.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> executableUsers;

    /**
     * A list of filters used to match properties for Images. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * An optional list of the AMI IDs to describe. If not specified, all
     * AMIs will be described.
     *
     * @return An optional list of the AMI IDs to describe. If not specified, all
     *         AMIs will be described.
     */
    public java.util.List<String> getImageIds() {
        if (imageIds == null) {
              imageIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              imageIds.setAutoConstruct(true);
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
        com.amazonaws.internal.ListWithAutoConstructFlag<String> imageIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(imageIds.size());
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
            com.amazonaws.internal.ListWithAutoConstructFlag<String> imageIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(imageIds.size());
            imageIdsCopy.addAll(imageIds);
            this.imageIds = imageIdsCopy;
        }

        return this;
    }

    /**
     * An optional list of owners by which to scope the described AMIs. Valid
     * values are: <ul> <li> <code>self</code> : AMIs owned by you </li> <li>
     * <i>AWS account ID</i> : AMIs owned by this account ID </li> <li>
     * <code>aws-marketplace</code> : AMIs owned by the AWS Marketplace </li>
     * <li> <code>amazon</code> : AMIs owned by Amazon </li> <li>
     * <code>all</code> : Do not scope the AMIs returned by owner </li> </ul>
     * <p> The values <code>self</code>, <code>aws-marketplace</code>,
     * <code>amazon</code>, and <code>all</code> are literals.
     *
     * @return An optional list of owners by which to scope the described AMIs. Valid
     *         values are: <ul> <li> <code>self</code> : AMIs owned by you </li> <li>
     *         <i>AWS account ID</i> : AMIs owned by this account ID </li> <li>
     *         <code>aws-marketplace</code> : AMIs owned by the AWS Marketplace </li>
     *         <li> <code>amazon</code> : AMIs owned by Amazon </li> <li>
     *         <code>all</code> : Do not scope the AMIs returned by owner </li> </ul>
     *         <p> The values <code>self</code>, <code>aws-marketplace</code>,
     *         <code>amazon</code>, and <code>all</code> are literals.
     */
    public java.util.List<String> getOwners() {
        if (owners == null) {
              owners = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              owners.setAutoConstruct(true);
        }
        return owners;
    }
    
    /**
     * An optional list of owners by which to scope the described AMIs. Valid
     * values are: <ul> <li> <code>self</code> : AMIs owned by you </li> <li>
     * <i>AWS account ID</i> : AMIs owned by this account ID </li> <li>
     * <code>aws-marketplace</code> : AMIs owned by the AWS Marketplace </li>
     * <li> <code>amazon</code> : AMIs owned by Amazon </li> <li>
     * <code>all</code> : Do not scope the AMIs returned by owner </li> </ul>
     * <p> The values <code>self</code>, <code>aws-marketplace</code>,
     * <code>amazon</code>, and <code>all</code> are literals.
     *
     * @param owners An optional list of owners by which to scope the described AMIs. Valid
     *         values are: <ul> <li> <code>self</code> : AMIs owned by you </li> <li>
     *         <i>AWS account ID</i> : AMIs owned by this account ID </li> <li>
     *         <code>aws-marketplace</code> : AMIs owned by the AWS Marketplace </li>
     *         <li> <code>amazon</code> : AMIs owned by Amazon </li> <li>
     *         <code>all</code> : Do not scope the AMIs returned by owner </li> </ul>
     *         <p> The values <code>self</code>, <code>aws-marketplace</code>,
     *         <code>amazon</code>, and <code>all</code> are literals.
     */
    public void setOwners(java.util.Collection<String> owners) {
        if (owners == null) {
            this.owners = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ownersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(owners.size());
        ownersCopy.addAll(owners);
        this.owners = ownersCopy;
    }
    
    /**
     * An optional list of owners by which to scope the described AMIs. Valid
     * values are: <ul> <li> <code>self</code> : AMIs owned by you </li> <li>
     * <i>AWS account ID</i> : AMIs owned by this account ID </li> <li>
     * <code>aws-marketplace</code> : AMIs owned by the AWS Marketplace </li>
     * <li> <code>amazon</code> : AMIs owned by Amazon </li> <li>
     * <code>all</code> : Do not scope the AMIs returned by owner </li> </ul>
     * <p> The values <code>self</code>, <code>aws-marketplace</code>,
     * <code>amazon</code>, and <code>all</code> are literals.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owners An optional list of owners by which to scope the described AMIs. Valid
     *         values are: <ul> <li> <code>self</code> : AMIs owned by you </li> <li>
     *         <i>AWS account ID</i> : AMIs owned by this account ID </li> <li>
     *         <code>aws-marketplace</code> : AMIs owned by the AWS Marketplace </li>
     *         <li> <code>amazon</code> : AMIs owned by Amazon </li> <li>
     *         <code>all</code> : Do not scope the AMIs returned by owner </li> </ul>
     *         <p> The values <code>self</code>, <code>aws-marketplace</code>,
     *         <code>amazon</code>, and <code>all</code> are literals.
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
     * An optional list of owners by which to scope the described AMIs. Valid
     * values are: <ul> <li> <code>self</code> : AMIs owned by you </li> <li>
     * <i>AWS account ID</i> : AMIs owned by this account ID </li> <li>
     * <code>aws-marketplace</code> : AMIs owned by the AWS Marketplace </li>
     * <li> <code>amazon</code> : AMIs owned by Amazon </li> <li>
     * <code>all</code> : Do not scope the AMIs returned by owner </li> </ul>
     * <p> The values <code>self</code>, <code>aws-marketplace</code>,
     * <code>amazon</code>, and <code>all</code> are literals.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owners An optional list of owners by which to scope the described AMIs. Valid
     *         values are: <ul> <li> <code>self</code> : AMIs owned by you </li> <li>
     *         <i>AWS account ID</i> : AMIs owned by this account ID </li> <li>
     *         <code>aws-marketplace</code> : AMIs owned by the AWS Marketplace </li>
     *         <li> <code>amazon</code> : AMIs owned by Amazon </li> <li>
     *         <code>all</code> : Do not scope the AMIs returned by owner </li> </ul>
     *         <p> The values <code>self</code>, <code>aws-marketplace</code>,
     *         <code>amazon</code>, and <code>all</code> are literals.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeImagesRequest withOwners(java.util.Collection<String> owners) {
        if (owners == null) {
            this.owners = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ownersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(owners.size());
            ownersCopy.addAll(owners);
            this.owners = ownersCopy;
        }

        return this;
    }

    /**
     * An optional list of users whose launch permissions will be used to
     * scope the described AMIs. Valid values are: <ul> <li>
     * <code>self</code> : AMIs for which you have explicit launch
     * permissions </li> <li> <code>AWS account ID</code> : AMIs for which
     * this account ID has launch permissions </li> <li> <code>all</code> :
     * AMIs that have public launch permissions </li> </ul> <p> The values
     * <code>self</code> and <code>all</code> are literals.
     *
     * @return An optional list of users whose launch permissions will be used to
     *         scope the described AMIs. Valid values are: <ul> <li>
     *         <code>self</code> : AMIs for which you have explicit launch
     *         permissions </li> <li> <code>AWS account ID</code> : AMIs for which
     *         this account ID has launch permissions </li> <li> <code>all</code> :
     *         AMIs that have public launch permissions </li> </ul> <p> The values
     *         <code>self</code> and <code>all</code> are literals.
     */
    public java.util.List<String> getExecutableUsers() {
        if (executableUsers == null) {
              executableUsers = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              executableUsers.setAutoConstruct(true);
        }
        return executableUsers;
    }
    
    /**
     * An optional list of users whose launch permissions will be used to
     * scope the described AMIs. Valid values are: <ul> <li>
     * <code>self</code> : AMIs for which you have explicit launch
     * permissions </li> <li> <code>AWS account ID</code> : AMIs for which
     * this account ID has launch permissions </li> <li> <code>all</code> :
     * AMIs that have public launch permissions </li> </ul> <p> The values
     * <code>self</code> and <code>all</code> are literals.
     *
     * @param executableUsers An optional list of users whose launch permissions will be used to
     *         scope the described AMIs. Valid values are: <ul> <li>
     *         <code>self</code> : AMIs for which you have explicit launch
     *         permissions </li> <li> <code>AWS account ID</code> : AMIs for which
     *         this account ID has launch permissions </li> <li> <code>all</code> :
     *         AMIs that have public launch permissions </li> </ul> <p> The values
     *         <code>self</code> and <code>all</code> are literals.
     */
    public void setExecutableUsers(java.util.Collection<String> executableUsers) {
        if (executableUsers == null) {
            this.executableUsers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> executableUsersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(executableUsers.size());
        executableUsersCopy.addAll(executableUsers);
        this.executableUsers = executableUsersCopy;
    }
    
    /**
     * An optional list of users whose launch permissions will be used to
     * scope the described AMIs. Valid values are: <ul> <li>
     * <code>self</code> : AMIs for which you have explicit launch
     * permissions </li> <li> <code>AWS account ID</code> : AMIs for which
     * this account ID has launch permissions </li> <li> <code>all</code> :
     * AMIs that have public launch permissions </li> </ul> <p> The values
     * <code>self</code> and <code>all</code> are literals.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executableUsers An optional list of users whose launch permissions will be used to
     *         scope the described AMIs. Valid values are: <ul> <li>
     *         <code>self</code> : AMIs for which you have explicit launch
     *         permissions </li> <li> <code>AWS account ID</code> : AMIs for which
     *         this account ID has launch permissions </li> <li> <code>all</code> :
     *         AMIs that have public launch permissions </li> </ul> <p> The values
     *         <code>self</code> and <code>all</code> are literals.
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
     * An optional list of users whose launch permissions will be used to
     * scope the described AMIs. Valid values are: <ul> <li>
     * <code>self</code> : AMIs for which you have explicit launch
     * permissions </li> <li> <code>AWS account ID</code> : AMIs for which
     * this account ID has launch permissions </li> <li> <code>all</code> :
     * AMIs that have public launch permissions </li> </ul> <p> The values
     * <code>self</code> and <code>all</code> are literals.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executableUsers An optional list of users whose launch permissions will be used to
     *         scope the described AMIs. Valid values are: <ul> <li>
     *         <code>self</code> : AMIs for which you have explicit launch
     *         permissions </li> <li> <code>AWS account ID</code> : AMIs for which
     *         this account ID has launch permissions </li> <li> <code>all</code> :
     *         AMIs that have public launch permissions </li> </ul> <p> The values
     *         <code>self</code> and <code>all</code> are literals.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeImagesRequest withExecutableUsers(java.util.Collection<String> executableUsers) {
        if (executableUsers == null) {
            this.executableUsers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> executableUsersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(executableUsers.size());
            executableUsersCopy.addAll(executableUsers);
            this.executableUsers = executableUsersCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for Images. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Images. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for Images. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Images. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for Images. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Images. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
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
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Images. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeImagesRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeImagesRequest> getDryRunRequest() {
        Request<DescribeImagesRequest> request = new DescribeImagesRequestMarshaller().marshall(this);
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
        if (getImageIds() != null) sb.append("ImageIds: " + getImageIds() + ",");
        if (getOwners() != null) sb.append("Owners: " + getOwners() + ",");
        if (getExecutableUsers() != null) sb.append("ExecutableUsers: " + getExecutableUsers() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
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
    