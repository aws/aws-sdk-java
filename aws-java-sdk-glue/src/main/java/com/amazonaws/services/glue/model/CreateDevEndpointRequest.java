/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDevEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDevEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name to be assigned to the new DevEndpoint.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The IAM role for the DevEndpoint.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Security group IDs for the security groups to be used by the new DevEndpoint.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The subnet ID for the new DevEndpoint to use.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The public key to use for authentication.
     * </p>
     */
    private String publicKey;
    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     */
    private String extraPythonLibsS3Path;
    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     */
    private String extraJarsS3Path;

    /**
     * <p>
     * The name to be assigned to the new DevEndpoint.
     * </p>
     * 
     * @param endpointName
     *        The name to be assigned to the new DevEndpoint.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name to be assigned to the new DevEndpoint.
     * </p>
     * 
     * @return The name to be assigned to the new DevEndpoint.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name to be assigned to the new DevEndpoint.
     * </p>
     * 
     * @param endpointName
     *        The name to be assigned to the new DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The IAM role for the DevEndpoint.
     * </p>
     * 
     * @param roleArn
     *        The IAM role for the DevEndpoint.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role for the DevEndpoint.
     * </p>
     * 
     * @return The IAM role for the DevEndpoint.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role for the DevEndpoint.
     * </p>
     * 
     * @param roleArn
     *        The IAM role for the DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Security group IDs for the security groups to be used by the new DevEndpoint.
     * </p>
     * 
     * @return Security group IDs for the security groups to be used by the new DevEndpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * Security group IDs for the security groups to be used by the new DevEndpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        Security group IDs for the security groups to be used by the new DevEndpoint.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * Security group IDs for the security groups to be used by the new DevEndpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        Security group IDs for the security groups to be used by the new DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Security group IDs for the security groups to be used by the new DevEndpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        Security group IDs for the security groups to be used by the new DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID for the new DevEndpoint to use.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID for the new DevEndpoint to use.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID for the new DevEndpoint to use.
     * </p>
     * 
     * @return The subnet ID for the new DevEndpoint to use.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID for the new DevEndpoint to use.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID for the new DevEndpoint to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The public key to use for authentication.
     * </p>
     * 
     * @param publicKey
     *        The public key to use for authentication.
     */

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key to use for authentication.
     * </p>
     * 
     * @return The public key to use for authentication.
     */

    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * <p>
     * The public key to use for authentication.
     * </p>
     * 
     * @param publicKey
     *        The public key to use for authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withPublicKey(String publicKey) {
        setPublicKey(publicKey);
        return this;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     * </p>
     * 
     * @return The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     * </p>
     * 
     * @param numberOfNodes
     *        The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     * 
     * @param extraPythonLibsS3Path
     *        Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     *        Multiple values must be complete paths separated by a comma.</p>
     *        <p>
     *        Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on
     *        C extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *        not yet supported.
     */

    public void setExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
    }

    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     * 
     * @return Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     *         Multiple values must be complete paths separated by a comma.</p>
     *         <p>
     *         Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely
     *         on C extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library,
     *         are not yet supported.
     */

    public String getExtraPythonLibsS3Path() {
        return this.extraPythonLibsS3Path;
    }

    /**
     * <p>
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple
     * values must be complete paths separated by a comma.
     * </p>
     * <p>
     * Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C
     * extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are not yet
     * supported.
     * </p>
     * 
     * @param extraPythonLibsS3Path
     *        Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint.
     *        Multiple values must be complete paths separated by a comma.</p>
     *        <p>
     *        Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on
     *        C extensions, such as the <a href="http://pandas.pydata.org/">pandas</a> Python data analysis library, are
     *        not yet supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withExtraPythonLibsS3Path(String extraPythonLibsS3Path) {
        setExtraPythonLibsS3Path(extraPythonLibsS3Path);
        return this;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @param extraJarsS3Path
     *        Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     */

    public void setExtraJarsS3Path(String extraJarsS3Path) {
        this.extraJarsS3Path = extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @return Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     */

    public String getExtraJarsS3Path() {
        return this.extraJarsS3Path;
    }

    /**
     * <p>
     * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * </p>
     * 
     * @param extraJarsS3Path
     *        Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDevEndpointRequest withExtraJarsS3Path(String extraJarsS3Path) {
        setExtraJarsS3Path(extraJarsS3Path);
        return this;
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getPublicKey() != null)
            sb.append("PublicKey: ").append(getPublicKey()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getExtraPythonLibsS3Path() != null)
            sb.append("ExtraPythonLibsS3Path: ").append(getExtraPythonLibsS3Path()).append(",");
        if (getExtraJarsS3Path() != null)
            sb.append("ExtraJarsS3Path: ").append(getExtraJarsS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDevEndpointRequest == false)
            return false;
        CreateDevEndpointRequest other = (CreateDevEndpointRequest) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getExtraPythonLibsS3Path() == null ^ this.getExtraPythonLibsS3Path() == null)
            return false;
        if (other.getExtraPythonLibsS3Path() != null && other.getExtraPythonLibsS3Path().equals(this.getExtraPythonLibsS3Path()) == false)
            return false;
        if (other.getExtraJarsS3Path() == null ^ this.getExtraJarsS3Path() == null)
            return false;
        if (other.getExtraJarsS3Path() != null && other.getExtraJarsS3Path().equals(this.getExtraJarsS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getExtraPythonLibsS3Path() == null) ? 0 : getExtraPythonLibsS3Path().hashCode());
        hashCode = prime * hashCode + ((getExtraJarsS3Path() == null) ? 0 : getExtraJarsS3Path().hashCode());
        return hashCode;
    }

    @Override
    public CreateDevEndpointRequest clone() {
        return (CreateDevEndpointRequest) super.clone();
    }

}
