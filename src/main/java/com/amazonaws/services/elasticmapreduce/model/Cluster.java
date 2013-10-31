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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * The detailed description of the cluster.
 * </p>
 */
public class Cluster implements Serializable {

    /**
     * The unique identifier for the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String id;

    /**
     * The name of the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String name;

    /**
     * The current status details about the cluster.
     */
    private ClusterStatus status;

    /**
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, EC2 Key Name, Subnet Id, Instance Profile, and
     * so on.
     */
    private Ec2InstanceAttributes ec2InstanceAttributes;

    /**
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     */
    private String logUri;

    /**
     * The AMI version requested for this cluster.<!-- For more information,
     * see <a>JobFlowDetail$AmiVersion</a>.-->
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String requestedAmiVersion;

    /**
     * The AMI version running on this cluster. This differs from the
     * requested version only if the requested version is a meta version,
     * such as "latest". <!--For more information, see
     * <a>JobFlowDetail$AmiVersion</a>.-->
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String runningAmiVersion;

    /**
     * Specifies whether the cluster should terminate after completing all
     * steps.
     */
    private Boolean autoTerminate;

    /**
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention,
     * or in the event of a cluster error.
     */
    private Boolean terminationProtected;

    /**
     * Indicates whether the job flow is visible to all IAM users of the AWS
     * account associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and
     * manage the job flow if they have the proper policy permissions set. If
     * this value is <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the
     * <a>SetVisibleToAllUsers</a> action.
     */
    private Boolean visibleToAllUsers;

    /**
     * The applications installed on this cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Application> applications;

    /**
     * The unique identifier for the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The unique identifier for the cluster.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The unique identifier for the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param id The unique identifier for the cluster.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The unique identifier for the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param id The unique identifier for the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name of the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The name of the cluster.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the cluster.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param name The name of the cluster.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param name The name of the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The current status details about the cluster.
     *
     * @return The current status details about the cluster.
     */
    public ClusterStatus getStatus() {
        return status;
    }
    
    /**
     * The current status details about the cluster.
     *
     * @param status The current status details about the cluster.
     */
    public void setStatus(ClusterStatus status) {
        this.status = status;
    }
    
    /**
     * The current status details about the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The current status details about the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withStatus(ClusterStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, EC2 Key Name, Subnet Id, Instance Profile, and
     * so on.
     *
     * @return Provides information about the EC2 instances in a cluster grouped by
     *         category. For example, EC2 Key Name, Subnet Id, Instance Profile, and
     *         so on.
     */
    public Ec2InstanceAttributes getEc2InstanceAttributes() {
        return ec2InstanceAttributes;
    }
    
    /**
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, EC2 Key Name, Subnet Id, Instance Profile, and
     * so on.
     *
     * @param ec2InstanceAttributes Provides information about the EC2 instances in a cluster grouped by
     *         category. For example, EC2 Key Name, Subnet Id, Instance Profile, and
     *         so on.
     */
    public void setEc2InstanceAttributes(Ec2InstanceAttributes ec2InstanceAttributes) {
        this.ec2InstanceAttributes = ec2InstanceAttributes;
    }
    
    /**
     * Provides information about the EC2 instances in a cluster grouped by
     * category. For example, EC2 Key Name, Subnet Id, Instance Profile, and
     * so on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2InstanceAttributes Provides information about the EC2 instances in a cluster grouped by
     *         category. For example, EC2 Key Name, Subnet Id, Instance Profile, and
     *         so on.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withEc2InstanceAttributes(Ec2InstanceAttributes ec2InstanceAttributes) {
        this.ec2InstanceAttributes = ec2InstanceAttributes;
        return this;
    }

    /**
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     *
     * @return The path to the Amazon S3 location where logs for this cluster are
     *         stored.
     */
    public String getLogUri() {
        return logUri;
    }
    
    /**
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     *
     * @param logUri The path to the Amazon S3 location where logs for this cluster are
     *         stored.
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }
    
    /**
     * The path to the Amazon S3 location where logs for this cluster are
     * stored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logUri The path to the Amazon S3 location where logs for this cluster are
     *         stored.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * The AMI version requested for this cluster.<!-- For more information,
     * see <a>JobFlowDetail$AmiVersion</a>.-->
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The AMI version requested for this cluster.<!-- For more information,
     *         see <a>JobFlowDetail$AmiVersion</a>.-->
     */
    public String getRequestedAmiVersion() {
        return requestedAmiVersion;
    }
    
    /**
     * The AMI version requested for this cluster.<!-- For more information,
     * see <a>JobFlowDetail$AmiVersion</a>.-->
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param requestedAmiVersion The AMI version requested for this cluster.<!-- For more information,
     *         see <a>JobFlowDetail$AmiVersion</a>.-->
     */
    public void setRequestedAmiVersion(String requestedAmiVersion) {
        this.requestedAmiVersion = requestedAmiVersion;
    }
    
    /**
     * The AMI version requested for this cluster.<!-- For more information,
     * see <a>JobFlowDetail$AmiVersion</a>.-->
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param requestedAmiVersion The AMI version requested for this cluster.<!-- For more information,
     *         see <a>JobFlowDetail$AmiVersion</a>.-->
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withRequestedAmiVersion(String requestedAmiVersion) {
        this.requestedAmiVersion = requestedAmiVersion;
        return this;
    }

    /**
     * The AMI version running on this cluster. This differs from the
     * requested version only if the requested version is a meta version,
     * such as "latest". <!--For more information, see
     * <a>JobFlowDetail$AmiVersion</a>.-->
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The AMI version running on this cluster. This differs from the
     *         requested version only if the requested version is a meta version,
     *         such as "latest". <!--For more information, see
     *         <a>JobFlowDetail$AmiVersion</a>.-->
     */
    public String getRunningAmiVersion() {
        return runningAmiVersion;
    }
    
    /**
     * The AMI version running on this cluster. This differs from the
     * requested version only if the requested version is a meta version,
     * such as "latest". <!--For more information, see
     * <a>JobFlowDetail$AmiVersion</a>.-->
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param runningAmiVersion The AMI version running on this cluster. This differs from the
     *         requested version only if the requested version is a meta version,
     *         such as "latest". <!--For more information, see
     *         <a>JobFlowDetail$AmiVersion</a>.-->
     */
    public void setRunningAmiVersion(String runningAmiVersion) {
        this.runningAmiVersion = runningAmiVersion;
    }
    
    /**
     * The AMI version running on this cluster. This differs from the
     * requested version only if the requested version is a meta version,
     * such as "latest". <!--For more information, see
     * <a>JobFlowDetail$AmiVersion</a>.-->
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param runningAmiVersion The AMI version running on this cluster. This differs from the
     *         requested version only if the requested version is a meta version,
     *         such as "latest". <!--For more information, see
     *         <a>JobFlowDetail$AmiVersion</a>.-->
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withRunningAmiVersion(String runningAmiVersion) {
        this.runningAmiVersion = runningAmiVersion;
        return this;
    }

    /**
     * Specifies whether the cluster should terminate after completing all
     * steps.
     *
     * @return Specifies whether the cluster should terminate after completing all
     *         steps.
     */
    public Boolean isAutoTerminate() {
        return autoTerminate;
    }
    
    /**
     * Specifies whether the cluster should terminate after completing all
     * steps.
     *
     * @param autoTerminate Specifies whether the cluster should terminate after completing all
     *         steps.
     */
    public void setAutoTerminate(Boolean autoTerminate) {
        this.autoTerminate = autoTerminate;
    }
    
    /**
     * Specifies whether the cluster should terminate after completing all
     * steps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoTerminate Specifies whether the cluster should terminate after completing all
     *         steps.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withAutoTerminate(Boolean autoTerminate) {
        this.autoTerminate = autoTerminate;
        return this;
    }

    /**
     * Specifies whether the cluster should terminate after completing all
     * steps.
     *
     * @return Specifies whether the cluster should terminate after completing all
     *         steps.
     */
    public Boolean getAutoTerminate() {
        return autoTerminate;
    }

    /**
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention,
     * or in the event of a cluster error.
     *
     * @return Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     *         instances from being terminated by an API call or user intervention,
     *         or in the event of a cluster error.
     */
    public Boolean isTerminationProtected() {
        return terminationProtected;
    }
    
    /**
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention,
     * or in the event of a cluster error.
     *
     * @param terminationProtected Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     *         instances from being terminated by an API call or user intervention,
     *         or in the event of a cluster error.
     */
    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }
    
    /**
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention,
     * or in the event of a cluster error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminationProtected Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     *         instances from being terminated by an API call or user intervention,
     *         or in the event of a cluster error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
        return this;
    }

    /**
     * Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     * instances from being terminated by an API call or user intervention,
     * or in the event of a cluster error.
     *
     * @return Indicates whether Amazon EMR will lock the cluster to prevent the EC2
     *         instances from being terminated by an API call or user intervention,
     *         or in the event of a cluster error.
     */
    public Boolean getTerminationProtected() {
        return terminationProtected;
    }

    /**
     * Indicates whether the job flow is visible to all IAM users of the AWS
     * account associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and
     * manage the job flow if they have the proper policy permissions set. If
     * this value is <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the
     * <a>SetVisibleToAllUsers</a> action.
     *
     * @return Indicates whether the job flow is visible to all IAM users of the AWS
     *         account associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and
     *         manage the job flow if they have the proper policy permissions set. If
     *         this value is <code>false</code>, only the IAM user that created the
     *         cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     */
    public Boolean isVisibleToAllUsers() {
        return visibleToAllUsers;
    }
    
    /**
     * Indicates whether the job flow is visible to all IAM users of the AWS
     * account associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and
     * manage the job flow if they have the proper policy permissions set. If
     * this value is <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the
     * <a>SetVisibleToAllUsers</a> action.
     *
     * @param visibleToAllUsers Indicates whether the job flow is visible to all IAM users of the AWS
     *         account associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and
     *         manage the job flow if they have the proper policy permissions set. If
     *         this value is <code>false</code>, only the IAM user that created the
     *         cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     */
    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }
    
    /**
     * Indicates whether the job flow is visible to all IAM users of the AWS
     * account associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and
     * manage the job flow if they have the proper policy permissions set. If
     * this value is <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the
     * <a>SetVisibleToAllUsers</a> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibleToAllUsers Indicates whether the job flow is visible to all IAM users of the AWS
     *         account associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and
     *         manage the job flow if they have the proper policy permissions set. If
     *         this value is <code>false</code>, only the IAM user that created the
     *         cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
        return this;
    }

    /**
     * Indicates whether the job flow is visible to all IAM users of the AWS
     * account associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and
     * manage the job flow if they have the proper policy permissions set. If
     * this value is <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the
     * <a>SetVisibleToAllUsers</a> action.
     *
     * @return Indicates whether the job flow is visible to all IAM users of the AWS
     *         account associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and
     *         manage the job flow if they have the proper policy permissions set. If
     *         this value is <code>false</code>, only the IAM user that created the
     *         cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     */
    public Boolean getVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * The applications installed on this cluster.
     *
     * @return The applications installed on this cluster.
     */
    public java.util.List<Application> getApplications() {
        if (applications == null) {
              applications = new com.amazonaws.internal.ListWithAutoConstructFlag<Application>();
              applications.setAutoConstruct(true);
        }
        return applications;
    }
    
    /**
     * The applications installed on this cluster.
     *
     * @param applications The applications installed on this cluster.
     */
    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Application> applicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Application>(applications.size());
        applicationsCopy.addAll(applications);
        this.applications = applicationsCopy;
    }
    
    /**
     * The applications installed on this cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applications The applications installed on this cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withApplications(Application... applications) {
        if (getApplications() == null) setApplications(new java.util.ArrayList<Application>(applications.length));
        for (Application value : applications) {
            getApplications().add(value);
        }
        return this;
    }
    
    /**
     * The applications installed on this cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applications The applications installed on this cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Cluster withApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Application> applicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Application>(applications.size());
            applicationsCopy.addAll(applications);
            this.applications = applicationsCopy;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getEc2InstanceAttributes() != null) sb.append("Ec2InstanceAttributes: " + getEc2InstanceAttributes() + ",");
        if (getLogUri() != null) sb.append("LogUri: " + getLogUri() + ",");
        if (getRequestedAmiVersion() != null) sb.append("RequestedAmiVersion: " + getRequestedAmiVersion() + ",");
        if (getRunningAmiVersion() != null) sb.append("RunningAmiVersion: " + getRunningAmiVersion() + ",");
        if (isAutoTerminate() != null) sb.append("AutoTerminate: " + isAutoTerminate() + ",");
        if (isTerminationProtected() != null) sb.append("TerminationProtected: " + isTerminationProtected() + ",");
        if (isVisibleToAllUsers() != null) sb.append("VisibleToAllUsers: " + isVisibleToAllUsers() + ",");
        if (getApplications() != null) sb.append("Applications: " + getApplications() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getEc2InstanceAttributes() == null) ? 0 : getEc2InstanceAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode()); 
        hashCode = prime * hashCode + ((getRequestedAmiVersion() == null) ? 0 : getRequestedAmiVersion().hashCode()); 
        hashCode = prime * hashCode + ((getRunningAmiVersion() == null) ? 0 : getRunningAmiVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAutoTerminate() == null) ? 0 : isAutoTerminate().hashCode()); 
        hashCode = prime * hashCode + ((isTerminationProtected() == null) ? 0 : isTerminationProtected().hashCode()); 
        hashCode = prime * hashCode + ((isVisibleToAllUsers() == null) ? 0 : isVisibleToAllUsers().hashCode()); 
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Cluster == false) return false;
        Cluster other = (Cluster)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getEc2InstanceAttributes() == null ^ this.getEc2InstanceAttributes() == null) return false;
        if (other.getEc2InstanceAttributes() != null && other.getEc2InstanceAttributes().equals(this.getEc2InstanceAttributes()) == false) return false; 
        if (other.getLogUri() == null ^ this.getLogUri() == null) return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false) return false; 
        if (other.getRequestedAmiVersion() == null ^ this.getRequestedAmiVersion() == null) return false;
        if (other.getRequestedAmiVersion() != null && other.getRequestedAmiVersion().equals(this.getRequestedAmiVersion()) == false) return false; 
        if (other.getRunningAmiVersion() == null ^ this.getRunningAmiVersion() == null) return false;
        if (other.getRunningAmiVersion() != null && other.getRunningAmiVersion().equals(this.getRunningAmiVersion()) == false) return false; 
        if (other.isAutoTerminate() == null ^ this.isAutoTerminate() == null) return false;
        if (other.isAutoTerminate() != null && other.isAutoTerminate().equals(this.isAutoTerminate()) == false) return false; 
        if (other.isTerminationProtected() == null ^ this.isTerminationProtected() == null) return false;
        if (other.isTerminationProtected() != null && other.isTerminationProtected().equals(this.isTerminationProtected()) == false) return false; 
        if (other.isVisibleToAllUsers() == null ^ this.isVisibleToAllUsers() == null) return false;
        if (other.isVisibleToAllUsers() != null && other.isVisibleToAllUsers().equals(this.isVisibleToAllUsers()) == false) return false; 
        if (other.getApplications() == null ^ this.getApplications() == null) return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false) return false; 
        return true;
    }
    
}
    