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
import com.amazonaws.services.ec2.model.transform.DescribeSnapshotsRequestMarshaller;

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
public class DescribeSnapshotsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSnapshotsRequest> {

    /**
     * The optional list of EBS snapshot IDs to describe.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotIds;

    /**
     * An optional list of owners by which to scope the described EBS
     * snapshots. Valid values are: <ul> <li> <code>self</code> : Snapshots
     * owned by you </li> <li> <i>AWS account ID</i> : Snapshots owned by
     * this account ID </li> <li> <code>amazon</code> : Snapshots owned by
     * Amazon </li> </ul> <p> The values <code>self</code> and
     * <code>amazon</code> are literals.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ownerIds;

    /**
     * An optional list of users. The described snapshots are scoped to only
     * those snapshots from which these users can create volumes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> restorableByUserIds;

    /**
     * A list of filters used to match properties for Snapshots. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The optional list of EBS snapshot IDs to describe.
     *
     * @return The optional list of EBS snapshot IDs to describe.
     */
    public java.util.List<String> getSnapshotIds() {
        if (snapshotIds == null) {
              snapshotIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              snapshotIds.setAutoConstruct(true);
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
        com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(snapshotIds.size());
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
            com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(snapshotIds.size());
            snapshotIdsCopy.addAll(snapshotIds);
            this.snapshotIds = snapshotIdsCopy;
        }

        return this;
    }

    /**
     * An optional list of owners by which to scope the described EBS
     * snapshots. Valid values are: <ul> <li> <code>self</code> : Snapshots
     * owned by you </li> <li> <i>AWS account ID</i> : Snapshots owned by
     * this account ID </li> <li> <code>amazon</code> : Snapshots owned by
     * Amazon </li> </ul> <p> The values <code>self</code> and
     * <code>amazon</code> are literals.
     *
     * @return An optional list of owners by which to scope the described EBS
     *         snapshots. Valid values are: <ul> <li> <code>self</code> : Snapshots
     *         owned by you </li> <li> <i>AWS account ID</i> : Snapshots owned by
     *         this account ID </li> <li> <code>amazon</code> : Snapshots owned by
     *         Amazon </li> </ul> <p> The values <code>self</code> and
     *         <code>amazon</code> are literals.
     */
    public java.util.List<String> getOwnerIds() {
        if (ownerIds == null) {
              ownerIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ownerIds.setAutoConstruct(true);
        }
        return ownerIds;
    }
    
    /**
     * An optional list of owners by which to scope the described EBS
     * snapshots. Valid values are: <ul> <li> <code>self</code> : Snapshots
     * owned by you </li> <li> <i>AWS account ID</i> : Snapshots owned by
     * this account ID </li> <li> <code>amazon</code> : Snapshots owned by
     * Amazon </li> </ul> <p> The values <code>self</code> and
     * <code>amazon</code> are literals.
     *
     * @param ownerIds An optional list of owners by which to scope the described EBS
     *         snapshots. Valid values are: <ul> <li> <code>self</code> : Snapshots
     *         owned by you </li> <li> <i>AWS account ID</i> : Snapshots owned by
     *         this account ID </li> <li> <code>amazon</code> : Snapshots owned by
     *         Amazon </li> </ul> <p> The values <code>self</code> and
     *         <code>amazon</code> are literals.
     */
    public void setOwnerIds(java.util.Collection<String> ownerIds) {
        if (ownerIds == null) {
            this.ownerIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ownerIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ownerIds.size());
        ownerIdsCopy.addAll(ownerIds);
        this.ownerIds = ownerIdsCopy;
    }
    
    /**
     * An optional list of owners by which to scope the described EBS
     * snapshots. Valid values are: <ul> <li> <code>self</code> : Snapshots
     * owned by you </li> <li> <i>AWS account ID</i> : Snapshots owned by
     * this account ID </li> <li> <code>amazon</code> : Snapshots owned by
     * Amazon </li> </ul> <p> The values <code>self</code> and
     * <code>amazon</code> are literals.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerIds An optional list of owners by which to scope the described EBS
     *         snapshots. Valid values are: <ul> <li> <code>self</code> : Snapshots
     *         owned by you </li> <li> <i>AWS account ID</i> : Snapshots owned by
     *         this account ID </li> <li> <code>amazon</code> : Snapshots owned by
     *         Amazon </li> </ul> <p> The values <code>self</code> and
     *         <code>amazon</code> are literals.
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
     * An optional list of owners by which to scope the described EBS
     * snapshots. Valid values are: <ul> <li> <code>self</code> : Snapshots
     * owned by you </li> <li> <i>AWS account ID</i> : Snapshots owned by
     * this account ID </li> <li> <code>amazon</code> : Snapshots owned by
     * Amazon </li> </ul> <p> The values <code>self</code> and
     * <code>amazon</code> are literals.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerIds An optional list of owners by which to scope the described EBS
     *         snapshots. Valid values are: <ul> <li> <code>self</code> : Snapshots
     *         owned by you </li> <li> <i>AWS account ID</i> : Snapshots owned by
     *         this account ID </li> <li> <code>amazon</code> : Snapshots owned by
     *         Amazon </li> </ul> <p> The values <code>self</code> and
     *         <code>amazon</code> are literals.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotsRequest withOwnerIds(java.util.Collection<String> ownerIds) {
        if (ownerIds == null) {
            this.ownerIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ownerIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ownerIds.size());
            ownerIdsCopy.addAll(ownerIds);
            this.ownerIds = ownerIdsCopy;
        }

        return this;
    }

    /**
     * An optional list of users. The described snapshots are scoped to only
     * those snapshots from which these users can create volumes.
     *
     * @return An optional list of users. The described snapshots are scoped to only
     *         those snapshots from which these users can create volumes.
     */
    public java.util.List<String> getRestorableByUserIds() {
        if (restorableByUserIds == null) {
              restorableByUserIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              restorableByUserIds.setAutoConstruct(true);
        }
        return restorableByUserIds;
    }
    
    /**
     * An optional list of users. The described snapshots are scoped to only
     * those snapshots from which these users can create volumes.
     *
     * @param restorableByUserIds An optional list of users. The described snapshots are scoped to only
     *         those snapshots from which these users can create volumes.
     */
    public void setRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        if (restorableByUserIds == null) {
            this.restorableByUserIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> restorableByUserIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(restorableByUserIds.size());
        restorableByUserIdsCopy.addAll(restorableByUserIds);
        this.restorableByUserIds = restorableByUserIdsCopy;
    }
    
    /**
     * An optional list of users. The described snapshots are scoped to only
     * those snapshots from which these users can create volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restorableByUserIds An optional list of users. The described snapshots are scoped to only
     *         those snapshots from which these users can create volumes.
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
     * An optional list of users. The described snapshots are scoped to only
     * those snapshots from which these users can create volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restorableByUserIds An optional list of users. The described snapshots are scoped to only
     *         those snapshots from which these users can create volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotsRequest withRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        if (restorableByUserIds == null) {
            this.restorableByUserIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> restorableByUserIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(restorableByUserIds.size());
            restorableByUserIdsCopy.addAll(restorableByUserIds);
            this.restorableByUserIds = restorableByUserIdsCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for Snapshots. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Snapshots. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
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
     * A list of filters used to match properties for Snapshots. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Snapshots. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
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
     * A list of filters used to match properties for Snapshots. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Snapshots. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
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
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Snapshots. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotsRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeSnapshotsRequest> getDryRunRequest() {
        Request<DescribeSnapshotsRequest> request = new DescribeSnapshotsRequestMarshaller().marshall(this);
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
        if (getSnapshotIds() != null) sb.append("SnapshotIds: " + getSnapshotIds() + ",");
        if (getOwnerIds() != null) sb.append("OwnerIds: " + getOwnerIds() + ",");
        if (getRestorableByUserIds() != null) sb.append("RestorableByUserIds: " + getRestorableByUserIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
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
    