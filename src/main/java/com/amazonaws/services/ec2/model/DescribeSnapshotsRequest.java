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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSnapshots(DescribeSnapshotsRequest) DescribeSnapshots operation}.
 * <p>
 * Returns information about the Amazon EBS snapshots available to you. Snapshots available to you include public snapshots available for any AWS
 * account to launch, private snapshots you own, and private snapshots owned by another AWS account but for which you've been given explicit create
 * volume permissions.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSnapshots(DescribeSnapshotsRequest)
 */
public class DescribeSnapshotsRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of EBS snapshot IDs to describe.
     */
    private java.util.List<String> snapshotIds;

    /**
     * The optional list of EBS snapshot owners.
     */
    private java.util.List<String> ownerIds;

    /**
     * The optional list of users who have permission to create volumes from
     * the described EBS snapshots.
     */
    private java.util.List<String> restorableByUserIds;

    /**
     * A list of filters used to match properties for Snapshots. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * The optional list of EBS snapshot IDs to describe.
     *
     * @return The optional list of EBS snapshot IDs to describe.
     */
    public java.util.List<String> getSnapshotIds() {
        
        if (snapshotIds == null) {
            snapshotIds = new java.util.ArrayList<String>();
        }
        return snapshotIds;
    }
    
    /**
     * The optional list of EBS snapshot IDs to describe.
     *
     * @param snapshotIds The optional list of EBS snapshot IDs to describe.
     */
    public void setSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
            return;
        }

        java.util.List<String> snapshotIdsCopy = new java.util.ArrayList<String>(snapshotIds.size());
        snapshotIdsCopy.addAll(snapshotIds);
        this.snapshotIds = snapshotIdsCopy;
    }
    
    /**
     * The optional list of EBS snapshot IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIds The optional list of EBS snapshot IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withSnapshotIds(String... snapshotIds) {
        if (getSnapshotIds() == null) setSnapshotIds(new java.util.ArrayList<String>(snapshotIds.length));
        for (String value : snapshotIds) {
            getSnapshotIds().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of EBS snapshot IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIds The optional list of EBS snapshot IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
        } else {
            java.util.List<String> snapshotIdsCopy = new java.util.ArrayList<String>(snapshotIds.size());
            snapshotIdsCopy.addAll(snapshotIds);
            this.snapshotIds = snapshotIdsCopy;
        }

        return this;
    }
    
    /**
     * The optional list of EBS snapshot owners.
     *
     * @return The optional list of EBS snapshot owners.
     */
    public java.util.List<String> getOwnerIds() {
        
        if (ownerIds == null) {
            ownerIds = new java.util.ArrayList<String>();
        }
        return ownerIds;
    }
    
    /**
     * The optional list of EBS snapshot owners.
     *
     * @param ownerIds The optional list of EBS snapshot owners.
     */
    public void setOwnerIds(java.util.Collection<String> ownerIds) {
        if (ownerIds == null) {
            this.ownerIds = null;
            return;
        }

        java.util.List<String> ownerIdsCopy = new java.util.ArrayList<String>(ownerIds.size());
        ownerIdsCopy.addAll(ownerIds);
        this.ownerIds = ownerIdsCopy;
    }
    
    /**
     * The optional list of EBS snapshot owners.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerIds The optional list of EBS snapshot owners.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withOwnerIds(String... ownerIds) {
        if (getOwnerIds() == null) setOwnerIds(new java.util.ArrayList<String>(ownerIds.length));
        for (String value : ownerIds) {
            getOwnerIds().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of EBS snapshot owners.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerIds The optional list of EBS snapshot owners.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withOwnerIds(java.util.Collection<String> ownerIds) {
        if (ownerIds == null) {
            this.ownerIds = null;
        } else {
            java.util.List<String> ownerIdsCopy = new java.util.ArrayList<String>(ownerIds.size());
            ownerIdsCopy.addAll(ownerIds);
            this.ownerIds = ownerIdsCopy;
        }

        return this;
    }
    
    /**
     * The optional list of users who have permission to create volumes from
     * the described EBS snapshots.
     *
     * @return The optional list of users who have permission to create volumes from
     *         the described EBS snapshots.
     */
    public java.util.List<String> getRestorableByUserIds() {
        
        if (restorableByUserIds == null) {
            restorableByUserIds = new java.util.ArrayList<String>();
        }
        return restorableByUserIds;
    }
    
    /**
     * The optional list of users who have permission to create volumes from
     * the described EBS snapshots.
     *
     * @param restorableByUserIds The optional list of users who have permission to create volumes from
     *         the described EBS snapshots.
     */
    public void setRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        if (restorableByUserIds == null) {
            this.restorableByUserIds = null;
            return;
        }

        java.util.List<String> restorableByUserIdsCopy = new java.util.ArrayList<String>(restorableByUserIds.size());
        restorableByUserIdsCopy.addAll(restorableByUserIds);
        this.restorableByUserIds = restorableByUserIdsCopy;
    }
    
    /**
     * The optional list of users who have permission to create volumes from
     * the described EBS snapshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restorableByUserIds The optional list of users who have permission to create volumes from
     *         the described EBS snapshots.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withRestorableByUserIds(String... restorableByUserIds) {
        if (getRestorableByUserIds() == null) setRestorableByUserIds(new java.util.ArrayList<String>(restorableByUserIds.length));
        for (String value : restorableByUserIds) {
            getRestorableByUserIds().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of users who have permission to create volumes from
     * the described EBS snapshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restorableByUserIds The optional list of users who have permission to create volumes from
     *         the described EBS snapshots.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        if (restorableByUserIds == null) {
            this.restorableByUserIds = null;
        } else {
            java.util.List<String> restorableByUserIdsCopy = new java.util.ArrayList<String>(restorableByUserIds.size());
            restorableByUserIdsCopy.addAll(restorableByUserIds);
            this.restorableByUserIds = restorableByUserIdsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for Snapshots. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Snapshots. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
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
     * A list of filters used to match properties for Snapshots. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Snapshots. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
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
     * A list of filters used to match properties for Snapshots. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Snapshots. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Snapshots. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Snapshots. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSnapshotsRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (snapshotIds != null) sb.append("SnapshotIds: " + snapshotIds + ", ");
        if (ownerIds != null) sb.append("OwnerIds: " + ownerIds + ", ");
        if (restorableByUserIds != null) sb.append("RestorableByUserIds: " + restorableByUserIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotIds() == null) ? 0 : getSnapshotIds().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerIds() == null) ? 0 : getOwnerIds().hashCode()); 
        hashCode = prime * hashCode + ((getRestorableByUserIds() == null) ? 0 : getRestorableByUserIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeSnapshotsRequest == false) return false;
        DescribeSnapshotsRequest other = (DescribeSnapshotsRequest)obj;
        
        if (other.getSnapshotIds() == null ^ this.getSnapshotIds() == null) return false;
        if (other.getSnapshotIds() != null && other.getSnapshotIds().equals(this.getSnapshotIds()) == false) return false; 
        if (other.getOwnerIds() == null ^ this.getOwnerIds() == null) return false;
        if (other.getOwnerIds() != null && other.getOwnerIds().equals(this.getOwnerIds()) == false) return false; 
        if (other.getRestorableByUserIds() == null ^ this.getRestorableByUserIds() == null) return false;
        if (other.getRestorableByUserIds() != null && other.getRestorableByUserIds().equals(this.getRestorableByUserIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    