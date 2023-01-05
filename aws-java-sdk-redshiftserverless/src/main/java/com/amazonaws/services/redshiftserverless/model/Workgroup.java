/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collection of computing resources from which an endpoint is created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/Workgroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Workgroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
     * </p>
     */
    private Integer baseCapacity;
    /**
     * <p>
     * An array of parameters to set for finer control over a database. The options are <code>datestyle</code>,
     * <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     * <code>max_query_execution_time</code>.
     * </p>
     */
    private java.util.List<ConfigParameter> configParameters;
    /**
     * <p>
     * The creation date of the workgroup.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The endpoint that is created from the workgroup.
     * </p>
     */
    private Endpoint endpoint;
    /**
     * <p>
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which forces Amazon
     * Redshift Serverless to route traffic through your VPC.
     * </p>
     */
    private Boolean enhancedVpcRouting;
    /**
     * <p>
     * The namespace the workgroup is associated with.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The custom port to use when connecting to a workgroup. Valid port ranges are 5431-5455 and 8191-8215. The default
     * is 5439.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * A value that specifies whether the workgroup can be accessible from a public network
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * An array of security group IDs to associate with the workgroup.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The status of the workgroup.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An array of subnet IDs the workgroup is associated with.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that links to the workgroup.
     * </p>
     */
    private String workgroupArn;
    /**
     * <p>
     * The unique identifier of the workgroup.
     * </p>
     */
    private String workgroupId;
    /**
     * <p>
     * The name of the workgroup.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
     * </p>
     * 
     * @param baseCapacity
     *        The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
     */

    public void setBaseCapacity(Integer baseCapacity) {
        this.baseCapacity = baseCapacity;
    }

    /**
     * <p>
     * The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
     * </p>
     * 
     * @return The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
     */

    public Integer getBaseCapacity() {
        return this.baseCapacity;
    }

    /**
     * <p>
     * The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
     * </p>
     * 
     * @param baseCapacity
     *        The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withBaseCapacity(Integer baseCapacity) {
        setBaseCapacity(baseCapacity);
        return this;
    }

    /**
     * <p>
     * An array of parameters to set for finer control over a database. The options are <code>datestyle</code>,
     * <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     * <code>max_query_execution_time</code>.
     * </p>
     * 
     * @return An array of parameters to set for finer control over a database. The options are <code>datestyle</code>,
     *         <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     *         <code>max_query_execution_time</code>.
     */

    public java.util.List<ConfigParameter> getConfigParameters() {
        return configParameters;
    }

    /**
     * <p>
     * An array of parameters to set for finer control over a database. The options are <code>datestyle</code>,
     * <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     * <code>max_query_execution_time</code>.
     * </p>
     * 
     * @param configParameters
     *        An array of parameters to set for finer control over a database. The options are <code>datestyle</code>,
     *        <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     *        <code>max_query_execution_time</code>.
     */

    public void setConfigParameters(java.util.Collection<ConfigParameter> configParameters) {
        if (configParameters == null) {
            this.configParameters = null;
            return;
        }

        this.configParameters = new java.util.ArrayList<ConfigParameter>(configParameters);
    }

    /**
     * <p>
     * An array of parameters to set for finer control over a database. The options are <code>datestyle</code>,
     * <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     * <code>max_query_execution_time</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigParameters(java.util.Collection)} or {@link #withConfigParameters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configParameters
     *        An array of parameters to set for finer control over a database. The options are <code>datestyle</code>,
     *        <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     *        <code>max_query_execution_time</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withConfigParameters(ConfigParameter... configParameters) {
        if (this.configParameters == null) {
            setConfigParameters(new java.util.ArrayList<ConfigParameter>(configParameters.length));
        }
        for (ConfigParameter ele : configParameters) {
            this.configParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of parameters to set for finer control over a database. The options are <code>datestyle</code>,
     * <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     * <code>max_query_execution_time</code>.
     * </p>
     * 
     * @param configParameters
     *        An array of parameters to set for finer control over a database. The options are <code>datestyle</code>,
     *        <code>enable_user_activity_logging</code>, <code>query_group</code>, <code>search_path</code>, and
     *        <code>max_query_execution_time</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withConfigParameters(java.util.Collection<ConfigParameter> configParameters) {
        setConfigParameters(configParameters);
        return this;
    }

    /**
     * <p>
     * The creation date of the workgroup.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the workgroup.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date of the workgroup.
     * </p>
     * 
     * @return The creation date of the workgroup.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date of the workgroup.
     * </p>
     * 
     * @param creationDate
     *        The creation date of the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The endpoint that is created from the workgroup.
     * </p>
     * 
     * @param endpoint
     *        The endpoint that is created from the workgroup.
     */

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint that is created from the workgroup.
     * </p>
     * 
     * @return The endpoint that is created from the workgroup.
     */

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint that is created from the workgroup.
     * </p>
     * 
     * @param endpoint
     *        The endpoint that is created from the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withEndpoint(Endpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which forces Amazon
     * Redshift Serverless to route traffic through your VPC.
     * </p>
     * 
     * @param enhancedVpcRouting
     *        The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which forces
     *        Amazon Redshift Serverless to route traffic through your VPC.
     */

    public void setEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
    }

    /**
     * <p>
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which forces Amazon
     * Redshift Serverless to route traffic through your VPC.
     * </p>
     * 
     * @return The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which forces
     *         Amazon Redshift Serverless to route traffic through your VPC.
     */

    public Boolean getEnhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }

    /**
     * <p>
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which forces Amazon
     * Redshift Serverless to route traffic through your VPC.
     * </p>
     * 
     * @param enhancedVpcRouting
     *        The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which forces
     *        Amazon Redshift Serverless to route traffic through your VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        setEnhancedVpcRouting(enhancedVpcRouting);
        return this;
    }

    /**
     * <p>
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which forces Amazon
     * Redshift Serverless to route traffic through your VPC.
     * </p>
     * 
     * @return The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which forces
     *         Amazon Redshift Serverless to route traffic through your VPC.
     */

    public Boolean isEnhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }

    /**
     * <p>
     * The namespace the workgroup is associated with.
     * </p>
     * 
     * @param namespaceName
     *        The namespace the workgroup is associated with.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The namespace the workgroup is associated with.
     * </p>
     * 
     * @return The namespace the workgroup is associated with.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The namespace the workgroup is associated with.
     * </p>
     * 
     * @param namespaceName
     *        The namespace the workgroup is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The custom port to use when connecting to a workgroup. Valid port ranges are 5431-5455 and 8191-8215. The default
     * is 5439.
     * </p>
     * 
     * @param port
     *        The custom port to use when connecting to a workgroup. Valid port ranges are 5431-5455 and 8191-8215. The
     *        default is 5439.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The custom port to use when connecting to a workgroup. Valid port ranges are 5431-5455 and 8191-8215. The default
     * is 5439.
     * </p>
     * 
     * @return The custom port to use when connecting to a workgroup. Valid port ranges are 5431-5455 and 8191-8215. The
     *         default is 5439.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The custom port to use when connecting to a workgroup. Valid port ranges are 5431-5455 and 8191-8215. The default
     * is 5439.
     * </p>
     * 
     * @param port
     *        The custom port to use when connecting to a workgroup. Valid port ranges are 5431-5455 and 8191-8215. The
     *        default is 5439.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the workgroup can be accessible from a public network
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that specifies whether the workgroup can be accessible from a public network
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A value that specifies whether the workgroup can be accessible from a public network
     * </p>
     * 
     * @return A value that specifies whether the workgroup can be accessible from a public network
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A value that specifies whether the workgroup can be accessible from a public network
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that specifies whether the workgroup can be accessible from a public network
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the workgroup can be accessible from a public network
     * </p>
     * 
     * @return A value that specifies whether the workgroup can be accessible from a public network
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * An array of security group IDs to associate with the workgroup.
     * </p>
     * 
     * @return An array of security group IDs to associate with the workgroup.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * An array of security group IDs to associate with the workgroup.
     * </p>
     * 
     * @param securityGroupIds
     *        An array of security group IDs to associate with the workgroup.
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
     * An array of security group IDs to associate with the workgroup.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        An array of security group IDs to associate with the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withSecurityGroupIds(String... securityGroupIds) {
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
     * An array of security group IDs to associate with the workgroup.
     * </p>
     * 
     * @param securityGroupIds
     *        An array of security group IDs to associate with the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The status of the workgroup.
     * </p>
     * 
     * @param status
     *        The status of the workgroup.
     * @see WorkgroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the workgroup.
     * </p>
     * 
     * @return The status of the workgroup.
     * @see WorkgroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the workgroup.
     * </p>
     * 
     * @param status
     *        The status of the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkgroupStatus
     */

    public Workgroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the workgroup.
     * </p>
     * 
     * @param status
     *        The status of the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkgroupStatus
     */

    public Workgroup withStatus(WorkgroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An array of subnet IDs the workgroup is associated with.
     * </p>
     * 
     * @return An array of subnet IDs the workgroup is associated with.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * An array of subnet IDs the workgroup is associated with.
     * </p>
     * 
     * @param subnetIds
     *        An array of subnet IDs the workgroup is associated with.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * An array of subnet IDs the workgroup is associated with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        An array of subnet IDs the workgroup is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of subnet IDs the workgroup is associated with.
     * </p>
     * 
     * @param subnetIds
     *        An array of subnet IDs the workgroup is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that links to the workgroup.
     * </p>
     * 
     * @param workgroupArn
     *        The Amazon Resource Name (ARN) that links to the workgroup.
     */

    public void setWorkgroupArn(String workgroupArn) {
        this.workgroupArn = workgroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that links to the workgroup.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that links to the workgroup.
     */

    public String getWorkgroupArn() {
        return this.workgroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that links to the workgroup.
     * </p>
     * 
     * @param workgroupArn
     *        The Amazon Resource Name (ARN) that links to the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withWorkgroupArn(String workgroupArn) {
        setWorkgroupArn(workgroupArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the workgroup.
     * </p>
     * 
     * @param workgroupId
     *        The unique identifier of the workgroup.
     */

    public void setWorkgroupId(String workgroupId) {
        this.workgroupId = workgroupId;
    }

    /**
     * <p>
     * The unique identifier of the workgroup.
     * </p>
     * 
     * @return The unique identifier of the workgroup.
     */

    public String getWorkgroupId() {
        return this.workgroupId;
    }

    /**
     * <p>
     * The unique identifier of the workgroup.
     * </p>
     * 
     * @param workgroupId
     *        The unique identifier of the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withWorkgroupId(String workgroupId) {
        setWorkgroupId(workgroupId);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup.
     * </p>
     * 
     * @return The name of the workgroup.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workgroup withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBaseCapacity() != null)
            sb.append("BaseCapacity: ").append(getBaseCapacity()).append(",");
        if (getConfigParameters() != null)
            sb.append("ConfigParameters: ").append(getConfigParameters()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: ").append(getEnhancedVpcRouting()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getWorkgroupArn() != null)
            sb.append("WorkgroupArn: ").append(getWorkgroupArn()).append(",");
        if (getWorkgroupId() != null)
            sb.append("WorkgroupId: ").append(getWorkgroupId()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Workgroup == false)
            return false;
        Workgroup other = (Workgroup) obj;
        if (other.getBaseCapacity() == null ^ this.getBaseCapacity() == null)
            return false;
        if (other.getBaseCapacity() != null && other.getBaseCapacity().equals(this.getBaseCapacity()) == false)
            return false;
        if (other.getConfigParameters() == null ^ this.getConfigParameters() == null)
            return false;
        if (other.getConfigParameters() != null && other.getConfigParameters().equals(this.getConfigParameters()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getWorkgroupArn() == null ^ this.getWorkgroupArn() == null)
            return false;
        if (other.getWorkgroupArn() != null && other.getWorkgroupArn().equals(this.getWorkgroupArn()) == false)
            return false;
        if (other.getWorkgroupId() == null ^ this.getWorkgroupId() == null)
            return false;
        if (other.getWorkgroupId() != null && other.getWorkgroupId().equals(this.getWorkgroupId()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseCapacity() == null) ? 0 : getBaseCapacity().hashCode());
        hashCode = prime * hashCode + ((getConfigParameters() == null) ? 0 : getConfigParameters().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupArn() == null) ? 0 : getWorkgroupArn().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupId() == null) ? 0 : getWorkgroupId().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public Workgroup clone() {
        try {
            return (Workgroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.WorkgroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
