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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#createClusterParameterGroup(CreateClusterParameterGroupRequest) CreateClusterParameterGroup operation}.
 * <p>
 * Creates an Amazon Redshift parameter group.
 * </p>
 * <p>
 * Creating parameter groups is independent of creating clusters. You can associate a cluster with a parameter group when you create the cluster. You can
 * also associate an existing cluster with a parameter group after the cluster is created by using ModifyCluster.
 * </p>
 * <p>
 * Parameters in the parameter group define specific behavior that applies to the databases you create on the cluster. For more information about
 * managing parameter groups, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html"> Amazon Redshift
 * Parameter Groups </a> in the <i>Amazon Redshift Management Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#createClusterParameterGroup(CreateClusterParameterGroupRequest)
 */
public class CreateClusterParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter.</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens.</li> <li>Must be unique withing your
     * AWS account.</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     */
    private String parameterGroupName;

    /**
     * The Amazon Redshift engine version to which the cluster parameter
     * group applies. The cluster engine version determines the set of
     * parameters. <p>To get a list of valid parameter group family names,
     * you can call <a>DescribeClusterParameterGroups</a>. By default, Amazon
     * Redshift returns a list of all the parameter groups that are owned by
     * your AWS account, including the default parameter groups for each
     * Amazon Redshift engine version. The parameter group family names
     * associated with the default parameter groups provide you the valid
     * values. For example, a valid family name is "redshift-1.0".
     */
    private String parameterGroupFamily;

    /**
     * A description of the parameter group.
     */
    private String description;

    /**
     * The name of the cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter.</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens.</li> <li>Must be unique withing your
     * AWS account.</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     *
     * @return The name of the cluster parameter group. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter.</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens.</li> <li>Must be unique withing your
     *         AWS account.</li> </ul> <note>This value is stored as a lower-case
     *         string.</note>
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }
    
    /**
     * The name of the cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter.</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens.</li> <li>Must be unique withing your
     * AWS account.</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     *
     * @param parameterGroupName The name of the cluster parameter group. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter.</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens.</li> <li>Must be unique withing your
     *         AWS account.</li> </ul> <note>This value is stored as a lower-case
     *         string.</note>
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }
    
    /**
     * The name of the cluster parameter group. <p> Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter.</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens.</li> <li>Must be unique withing your
     * AWS account.</li> </ul> <note>This value is stored as a lower-case
     * string.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupName The name of the cluster parameter group. <p> Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter.</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens.</li> <li>Must be unique withing your
     *         AWS account.</li> </ul> <note>This value is stored as a lower-case
     *         string.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterParameterGroupRequest withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * The Amazon Redshift engine version to which the cluster parameter
     * group applies. The cluster engine version determines the set of
     * parameters. <p>To get a list of valid parameter group family names,
     * you can call <a>DescribeClusterParameterGroups</a>. By default, Amazon
     * Redshift returns a list of all the parameter groups that are owned by
     * your AWS account, including the default parameter groups for each
     * Amazon Redshift engine version. The parameter group family names
     * associated with the default parameter groups provide you the valid
     * values. For example, a valid family name is "redshift-1.0".
     *
     * @return The Amazon Redshift engine version to which the cluster parameter
     *         group applies. The cluster engine version determines the set of
     *         parameters. <p>To get a list of valid parameter group family names,
     *         you can call <a>DescribeClusterParameterGroups</a>. By default, Amazon
     *         Redshift returns a list of all the parameter groups that are owned by
     *         your AWS account, including the default parameter groups for each
     *         Amazon Redshift engine version. The parameter group family names
     *         associated with the default parameter groups provide you the valid
     *         values. For example, a valid family name is "redshift-1.0".
     */
    public String getParameterGroupFamily() {
        return parameterGroupFamily;
    }
    
    /**
     * The Amazon Redshift engine version to which the cluster parameter
     * group applies. The cluster engine version determines the set of
     * parameters. <p>To get a list of valid parameter group family names,
     * you can call <a>DescribeClusterParameterGroups</a>. By default, Amazon
     * Redshift returns a list of all the parameter groups that are owned by
     * your AWS account, including the default parameter groups for each
     * Amazon Redshift engine version. The parameter group family names
     * associated with the default parameter groups provide you the valid
     * values. For example, a valid family name is "redshift-1.0".
     *
     * @param parameterGroupFamily The Amazon Redshift engine version to which the cluster parameter
     *         group applies. The cluster engine version determines the set of
     *         parameters. <p>To get a list of valid parameter group family names,
     *         you can call <a>DescribeClusterParameterGroups</a>. By default, Amazon
     *         Redshift returns a list of all the parameter groups that are owned by
     *         your AWS account, including the default parameter groups for each
     *         Amazon Redshift engine version. The parameter group family names
     *         associated with the default parameter groups provide you the valid
     *         values. For example, a valid family name is "redshift-1.0".
     */
    public void setParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }
    
    /**
     * The Amazon Redshift engine version to which the cluster parameter
     * group applies. The cluster engine version determines the set of
     * parameters. <p>To get a list of valid parameter group family names,
     * you can call <a>DescribeClusterParameterGroups</a>. By default, Amazon
     * Redshift returns a list of all the parameter groups that are owned by
     * your AWS account, including the default parameter groups for each
     * Amazon Redshift engine version. The parameter group family names
     * associated with the default parameter groups provide you the valid
     * values. For example, a valid family name is "redshift-1.0".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupFamily The Amazon Redshift engine version to which the cluster parameter
     *         group applies. The cluster engine version determines the set of
     *         parameters. <p>To get a list of valid parameter group family names,
     *         you can call <a>DescribeClusterParameterGroups</a>. By default, Amazon
     *         Redshift returns a list of all the parameter groups that are owned by
     *         your AWS account, including the default parameter groups for each
     *         Amazon Redshift engine version. The parameter group family names
     *         associated with the default parameter groups provide you the valid
     *         values. For example, a valid family name is "redshift-1.0".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterParameterGroupRequest withParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
        return this;
    }

    /**
     * A description of the parameter group.
     *
     * @return A description of the parameter group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the parameter group.
     *
     * @param description A description of the parameter group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateClusterParameterGroupRequest withDescription(String description) {
        this.description = description;
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
        if (getParameterGroupName() != null) sb.append("ParameterGroupName: " + getParameterGroupName() + ",");
        if (getParameterGroupFamily() != null) sb.append("ParameterGroupFamily: " + getParameterGroupFamily() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getParameterGroupFamily() == null) ? 0 : getParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateClusterParameterGroupRequest == false) return false;
        CreateClusterParameterGroupRequest other = (CreateClusterParameterGroupRequest)obj;
        
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null) return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false) return false; 
        if (other.getParameterGroupFamily() == null ^ this.getParameterGroupFamily() == null) return false;
        if (other.getParameterGroupFamily() != null && other.getParameterGroupFamily().equals(this.getParameterGroupFamily()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    