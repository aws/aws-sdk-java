/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A node represents an AWS Glue component like Trigger, Job etc. which is part of a workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Node" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Node implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the AWS Glue component represented by the node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique Id assigned to the node within the workflow.
     * </p>
     */
    private String uniqueId;
    /**
     * <p>
     * Details of the Trigger when the node represents a Trigger.
     * </p>
     */
    private TriggerNodeDetails triggerDetails;
    /**
     * <p>
     * Details of the Job when the node represents a Job.
     * </p>
     */
    private JobNodeDetails jobDetails;
    /**
     * <p>
     * Details of the crawler when the node represents a crawler.
     * </p>
     */
    private CrawlerNodeDetails crawlerDetails;

    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     * 
     * @param type
     *        The type of AWS Glue component represented by the node.
     * @see NodeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     * 
     * @return The type of AWS Glue component represented by the node.
     * @see NodeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     * 
     * @param type
     *        The type of AWS Glue component represented by the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeType
     */

    public Node withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     * 
     * @param type
     *        The type of AWS Glue component represented by the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeType
     */

    public Node withType(NodeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the AWS Glue component represented by the node.
     * </p>
     * 
     * @param name
     *        The name of the AWS Glue component represented by the node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AWS Glue component represented by the node.
     * </p>
     * 
     * @return The name of the AWS Glue component represented by the node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the AWS Glue component represented by the node.
     * </p>
     * 
     * @param name
     *        The name of the AWS Glue component represented by the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique Id assigned to the node within the workflow.
     * </p>
     * 
     * @param uniqueId
     *        The unique Id assigned to the node within the workflow.
     */

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * <p>
     * The unique Id assigned to the node within the workflow.
     * </p>
     * 
     * @return The unique Id assigned to the node within the workflow.
     */

    public String getUniqueId() {
        return this.uniqueId;
    }

    /**
     * <p>
     * The unique Id assigned to the node within the workflow.
     * </p>
     * 
     * @param uniqueId
     *        The unique Id assigned to the node within the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withUniqueId(String uniqueId) {
        setUniqueId(uniqueId);
        return this;
    }

    /**
     * <p>
     * Details of the Trigger when the node represents a Trigger.
     * </p>
     * 
     * @param triggerDetails
     *        Details of the Trigger when the node represents a Trigger.
     */

    public void setTriggerDetails(TriggerNodeDetails triggerDetails) {
        this.triggerDetails = triggerDetails;
    }

    /**
     * <p>
     * Details of the Trigger when the node represents a Trigger.
     * </p>
     * 
     * @return Details of the Trigger when the node represents a Trigger.
     */

    public TriggerNodeDetails getTriggerDetails() {
        return this.triggerDetails;
    }

    /**
     * <p>
     * Details of the Trigger when the node represents a Trigger.
     * </p>
     * 
     * @param triggerDetails
     *        Details of the Trigger when the node represents a Trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withTriggerDetails(TriggerNodeDetails triggerDetails) {
        setTriggerDetails(triggerDetails);
        return this;
    }

    /**
     * <p>
     * Details of the Job when the node represents a Job.
     * </p>
     * 
     * @param jobDetails
     *        Details of the Job when the node represents a Job.
     */

    public void setJobDetails(JobNodeDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * Details of the Job when the node represents a Job.
     * </p>
     * 
     * @return Details of the Job when the node represents a Job.
     */

    public JobNodeDetails getJobDetails() {
        return this.jobDetails;
    }

    /**
     * <p>
     * Details of the Job when the node represents a Job.
     * </p>
     * 
     * @param jobDetails
     *        Details of the Job when the node represents a Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withJobDetails(JobNodeDetails jobDetails) {
        setJobDetails(jobDetails);
        return this;
    }

    /**
     * <p>
     * Details of the crawler when the node represents a crawler.
     * </p>
     * 
     * @param crawlerDetails
     *        Details of the crawler when the node represents a crawler.
     */

    public void setCrawlerDetails(CrawlerNodeDetails crawlerDetails) {
        this.crawlerDetails = crawlerDetails;
    }

    /**
     * <p>
     * Details of the crawler when the node represents a crawler.
     * </p>
     * 
     * @return Details of the crawler when the node represents a crawler.
     */

    public CrawlerNodeDetails getCrawlerDetails() {
        return this.crawlerDetails;
    }

    /**
     * <p>
     * Details of the crawler when the node represents a crawler.
     * </p>
     * 
     * @param crawlerDetails
     *        Details of the crawler when the node represents a crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withCrawlerDetails(CrawlerNodeDetails crawlerDetails) {
        setCrawlerDetails(crawlerDetails);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUniqueId() != null)
            sb.append("UniqueId: ").append(getUniqueId()).append(",");
        if (getTriggerDetails() != null)
            sb.append("TriggerDetails: ").append(getTriggerDetails()).append(",");
        if (getJobDetails() != null)
            sb.append("JobDetails: ").append(getJobDetails()).append(",");
        if (getCrawlerDetails() != null)
            sb.append("CrawlerDetails: ").append(getCrawlerDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Node == false)
            return false;
        Node other = (Node) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUniqueId() == null ^ this.getUniqueId() == null)
            return false;
        if (other.getUniqueId() != null && other.getUniqueId().equals(this.getUniqueId()) == false)
            return false;
        if (other.getTriggerDetails() == null ^ this.getTriggerDetails() == null)
            return false;
        if (other.getTriggerDetails() != null && other.getTriggerDetails().equals(this.getTriggerDetails()) == false)
            return false;
        if (other.getJobDetails() == null ^ this.getJobDetails() == null)
            return false;
        if (other.getJobDetails() != null && other.getJobDetails().equals(this.getJobDetails()) == false)
            return false;
        if (other.getCrawlerDetails() == null ^ this.getCrawlerDetails() == null)
            return false;
        if (other.getCrawlerDetails() != null && other.getCrawlerDetails().equals(this.getCrawlerDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUniqueId() == null) ? 0 : getUniqueId().hashCode());
        hashCode = prime * hashCode + ((getTriggerDetails() == null) ? 0 : getTriggerDetails().hashCode());
        hashCode = prime * hashCode + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        hashCode = prime * hashCode + ((getCrawlerDetails() == null) ? 0 : getCrawlerDetails().hashCode());
        return hashCode;
    }

    @Override
    public Node clone() {
        try {
            return (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.NodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
