/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest) DescribeClusterSubnetGroups operation}.
 * <p>
 * Returns one or more cluster subnet group objects, which contain
 * metadata about your cluster subnet groups. By default, this operation
 * returns information about all cluster subnet groups that are defined
 * in you AWS account.
 * </p>
 * <p>
 * If you specify both tag keys and tag values in the same request,
 * Amazon Redshift returns all subnet groups that match any combination
 * of the specified keys and values. For example, if you have
 * <code>owner</code> and <code>environment</code> for tag keys, and
 * <code>admin</code> and <code>test</code> for tag values, all subnet
 * groups that have any combination of those values are returned.
 * </p>
 * <p>
 * If both tag keys and values are omitted from the request, subnet
 * groups are returned regardless of whether they have tag keys or values
 * associated with them.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeClusterSubnetGroups(DescribeClusterSubnetGroupsRequest)
 */
public class DescribeClusterSubnetGroupsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the cluster subnet group for which information is
     * requested.
     */
    private String clusterSubnetGroupName;

    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a
     * <a>DescribeClusterSubnetGroups</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     */
    private String marker;

    /**
     * A tag key or keys for which you want to return all matching cluster
     * subnet groups that are associated with the specified key or keys. For
     * example, suppose that you have subnet groups that are tagged with keys
     * called <code>owner</code> and <code>environment</code>. If you specify
     * both of these tag keys in the request, Amazon Redshift returns a
     * response with the subnet groups that have either or both of these tag
     * keys associated with them.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeys;

    /**
     * A tag value or values for which you want to return all matching
     * cluster subnet groups that are associated with the specified tag value
     * or values. For example, suppose that you have subnet groups that are
     * tagged with values called <code>admin</code> and <code>test</code>. If
     * you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the subnet groups that have either or both of
     * these tag values associated with them.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagValues;

    /**
     * The name of the cluster subnet group for which information is
     * requested.
     *
     * @return The name of the cluster subnet group for which information is
     *         requested.
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }
    
    /**
     * The name of the cluster subnet group for which information is
     * requested.
     *
     * @param clusterSubnetGroupName The name of the cluster subnet group for which information is
     *         requested.
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }
    
    /**
     * The name of the cluster subnet group for which information is
     * requested.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSubnetGroupName The name of the cluster subnet group for which information is
     *         requested.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClusterSubnetGroupsRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }

    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     *
     * @return The maximum number of response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned marker value.
     *         <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     *
     * @param maxRecords The maximum number of response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned marker value.
     *         <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of response records to return in each call. If the
     * number of remaining response records exceeds the specified
     * <code>MaxRecords</code> value, a value is returned in a
     * <code>marker</code> field of the response. You can retrieve the next
     * set of records by retrying the command with the returned marker value.
     * <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of response records to return in each call. If the
     *         number of remaining response records exceeds the specified
     *         <code>MaxRecords</code> value, a value is returned in a
     *         <code>marker</code> field of the response. You can retrieve the next
     *         set of records by retrying the command with the returned marker value.
     *         <p>Default: <code>100</code> <p>Constraints: minimum 20, maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClusterSubnetGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a
     * <a>DescribeClusterSubnetGroups</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     *
     * @return An optional parameter that specifies the starting point to return a
     *         set of response records. When the results of a
     *         <a>DescribeClusterSubnetGroups</a> request exceed the value specified
     *         in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the next
     *         set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a
     * <a>DescribeClusterSubnetGroups</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     *
     * @param marker An optional parameter that specifies the starting point to return a
     *         set of response records. When the results of a
     *         <a>DescribeClusterSubnetGroups</a> request exceed the value specified
     *         in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the next
     *         set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional parameter that specifies the starting point to return a
     * set of response records. When the results of a
     * <a>DescribeClusterSubnetGroups</a> request exceed the value specified
     * in <code>MaxRecords</code>, AWS returns a value in the
     * <code>Marker</code> field of the response. You can retrieve the next
     * set of response records by providing the returned marker value in the
     * <code>Marker</code> parameter and retrying the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional parameter that specifies the starting point to return a
     *         set of response records. When the results of a
     *         <a>DescribeClusterSubnetGroups</a> request exceed the value specified
     *         in <code>MaxRecords</code>, AWS returns a value in the
     *         <code>Marker</code> field of the response. You can retrieve the next
     *         set of response records by providing the returned marker value in the
     *         <code>Marker</code> parameter and retrying the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClusterSubnetGroupsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A tag key or keys for which you want to return all matching cluster
     * subnet groups that are associated with the specified key or keys. For
     * example, suppose that you have subnet groups that are tagged with keys
     * called <code>owner</code> and <code>environment</code>. If you specify
     * both of these tag keys in the request, Amazon Redshift returns a
     * response with the subnet groups that have either or both of these tag
     * keys associated with them.
     *
     * @return A tag key or keys for which you want to return all matching cluster
     *         subnet groups that are associated with the specified key or keys. For
     *         example, suppose that you have subnet groups that are tagged with keys
     *         called <code>owner</code> and <code>environment</code>. If you specify
     *         both of these tag keys in the request, Amazon Redshift returns a
     *         response with the subnet groups that have either or both of these tag
     *         keys associated with them.
     */
    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
              tagKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagKeys.setAutoConstruct(true);
        }
        return tagKeys;
    }
    
    /**
     * A tag key or keys for which you want to return all matching cluster
     * subnet groups that are associated with the specified key or keys. For
     * example, suppose that you have subnet groups that are tagged with keys
     * called <code>owner</code> and <code>environment</code>. If you specify
     * both of these tag keys in the request, Amazon Redshift returns a
     * response with the subnet groups that have either or both of these tag
     * keys associated with them.
     *
     * @param tagKeys A tag key or keys for which you want to return all matching cluster
     *         subnet groups that are associated with the specified key or keys. For
     *         example, suppose that you have subnet groups that are tagged with keys
     *         called <code>owner</code> and <code>environment</code>. If you specify
     *         both of these tag keys in the request, Amazon Redshift returns a
     *         response with the subnet groups that have either or both of these tag
     *         keys associated with them.
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagKeys.size());
        tagKeysCopy.addAll(tagKeys);
        this.tagKeys = tagKeysCopy;
    }
    
    /**
     * A tag key or keys for which you want to return all matching cluster
     * subnet groups that are associated with the specified key or keys. For
     * example, suppose that you have subnet groups that are tagged with keys
     * called <code>owner</code> and <code>environment</code>. If you specify
     * both of these tag keys in the request, Amazon Redshift returns a
     * response with the subnet groups that have either or both of these tag
     * keys associated with them.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagKeys(java.util.Collection)} or {@link
     * #withTagKeys(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys A tag key or keys for which you want to return all matching cluster
     *         subnet groups that are associated with the specified key or keys. For
     *         example, suppose that you have subnet groups that are tagged with keys
     *         called <code>owner</code> and <code>environment</code>. If you specify
     *         both of these tag keys in the request, Amazon Redshift returns a
     *         response with the subnet groups that have either or both of these tag
     *         keys associated with them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClusterSubnetGroupsRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        for (String value : tagKeys) {
            getTagKeys().add(value);
        }
        return this;
    }
    
    /**
     * A tag key or keys for which you want to return all matching cluster
     * subnet groups that are associated with the specified key or keys. For
     * example, suppose that you have subnet groups that are tagged with keys
     * called <code>owner</code> and <code>environment</code>. If you specify
     * both of these tag keys in the request, Amazon Redshift returns a
     * response with the subnet groups that have either or both of these tag
     * keys associated with them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys A tag key or keys for which you want to return all matching cluster
     *         subnet groups that are associated with the specified key or keys. For
     *         example, suppose that you have subnet groups that are tagged with keys
     *         called <code>owner</code> and <code>environment</code>. If you specify
     *         both of these tag keys in the request, Amazon Redshift returns a
     *         response with the subnet groups that have either or both of these tag
     *         keys associated with them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClusterSubnetGroupsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagKeys.size());
            tagKeysCopy.addAll(tagKeys);
            this.tagKeys = tagKeysCopy;
        }

        return this;
    }

    /**
     * A tag value or values for which you want to return all matching
     * cluster subnet groups that are associated with the specified tag value
     * or values. For example, suppose that you have subnet groups that are
     * tagged with values called <code>admin</code> and <code>test</code>. If
     * you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the subnet groups that have either or both of
     * these tag values associated with them.
     *
     * @return A tag value or values for which you want to return all matching
     *         cluster subnet groups that are associated with the specified tag value
     *         or values. For example, suppose that you have subnet groups that are
     *         tagged with values called <code>admin</code> and <code>test</code>. If
     *         you specify both of these tag values in the request, Amazon Redshift
     *         returns a response with the subnet groups that have either or both of
     *         these tag values associated with them.
     */
    public java.util.List<String> getTagValues() {
        if (tagValues == null) {
              tagValues = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagValues.setAutoConstruct(true);
        }
        return tagValues;
    }
    
    /**
     * A tag value or values for which you want to return all matching
     * cluster subnet groups that are associated with the specified tag value
     * or values. For example, suppose that you have subnet groups that are
     * tagged with values called <code>admin</code> and <code>test</code>. If
     * you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the subnet groups that have either or both of
     * these tag values associated with them.
     *
     * @param tagValues A tag value or values for which you want to return all matching
     *         cluster subnet groups that are associated with the specified tag value
     *         or values. For example, suppose that you have subnet groups that are
     *         tagged with values called <code>admin</code> and <code>test</code>. If
     *         you specify both of these tag values in the request, Amazon Redshift
     *         returns a response with the subnet groups that have either or both of
     *         these tag values associated with them.
     */
    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagValues.size());
        tagValuesCopy.addAll(tagValues);
        this.tagValues = tagValuesCopy;
    }
    
    /**
     * A tag value or values for which you want to return all matching
     * cluster subnet groups that are associated with the specified tag value
     * or values. For example, suppose that you have subnet groups that are
     * tagged with values called <code>admin</code> and <code>test</code>. If
     * you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the subnet groups that have either or both of
     * these tag values associated with them.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagValues(java.util.Collection)} or {@link
     * #withTagValues(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagValues A tag value or values for which you want to return all matching
     *         cluster subnet groups that are associated with the specified tag value
     *         or values. For example, suppose that you have subnet groups that are
     *         tagged with values called <code>admin</code> and <code>test</code>. If
     *         you specify both of these tag values in the request, Amazon Redshift
     *         returns a response with the subnet groups that have either or both of
     *         these tag values associated with them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClusterSubnetGroupsRequest withTagValues(String... tagValues) {
        if (getTagValues() == null) setTagValues(new java.util.ArrayList<String>(tagValues.length));
        for (String value : tagValues) {
            getTagValues().add(value);
        }
        return this;
    }
    
    /**
     * A tag value or values for which you want to return all matching
     * cluster subnet groups that are associated with the specified tag value
     * or values. For example, suppose that you have subnet groups that are
     * tagged with values called <code>admin</code> and <code>test</code>. If
     * you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the subnet groups that have either or both of
     * these tag values associated with them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagValues A tag value or values for which you want to return all matching
     *         cluster subnet groups that are associated with the specified tag value
     *         or values. For example, suppose that you have subnet groups that are
     *         tagged with values called <code>admin</code> and <code>test</code>. If
     *         you specify both of these tag values in the request, Amazon Redshift
     *         returns a response with the subnet groups that have either or both of
     *         these tag values associated with them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClusterSubnetGroupsRequest withTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagValues.size());
            tagValuesCopy.addAll(tagValues);
            this.tagValues = tagValuesCopy;
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
        if (getClusterSubnetGroupName() != null) sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getTagKeys() != null) sb.append("TagKeys: " + getTagKeys() + ",");
        if (getTagValues() != null) sb.append("TagValues: " + getTagValues() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode()); 
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterSubnetGroupsRequest == false) return false;
        DescribeClusterSubnetGroupsRequest other = (DescribeClusterSubnetGroupsRequest)obj;
        
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null) return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getTagKeys() == null ^ this.getTagKeys() == null) return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false) return false; 
        if (other.getTagValues() == null ^ this.getTagValues() == null) return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeClusterSubnetGroupsRequest clone() {
        
            return (DescribeClusterSubnetGroupsRequest) super.clone();
    }

}
    