/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of an AWS Trusted Advisor Check
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/CheckSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the AWS Trusted Advisor Check
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The AWS Services that the Check applies to
     * </p>
     */
    private java.util.List<String> awsServices;
    /**
     * <p>
     * A description of what the AWS Trusted Advisor Check is monitoring
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the AWS Trusted Advisor Check
     * </p>
     */
    private String id;
    /**
     * <p>
     * The column headings for the metadata returned in the resource
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * The name of the AWS Trusted Advisor Check
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * </p>
     */
    private java.util.List<String> pillars;
    /**
     * <p>
     * The source of the Recommendation
     * </p>
     */
    private String source;

    /**
     * <p>
     * The ARN of the AWS Trusted Advisor Check
     * </p>
     * 
     * @param arn
     *        The ARN of the AWS Trusted Advisor Check
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the AWS Trusted Advisor Check
     * </p>
     * 
     * @return The ARN of the AWS Trusted Advisor Check
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the AWS Trusted Advisor Check
     * </p>
     * 
     * @param arn
     *        The ARN of the AWS Trusted Advisor Check
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The AWS Services that the Check applies to
     * </p>
     * 
     * @return The AWS Services that the Check applies to
     */

    public java.util.List<String> getAwsServices() {
        return awsServices;
    }

    /**
     * <p>
     * The AWS Services that the Check applies to
     * </p>
     * 
     * @param awsServices
     *        The AWS Services that the Check applies to
     */

    public void setAwsServices(java.util.Collection<String> awsServices) {
        if (awsServices == null) {
            this.awsServices = null;
            return;
        }

        this.awsServices = new java.util.ArrayList<String>(awsServices);
    }

    /**
     * <p>
     * The AWS Services that the Check applies to
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsServices(java.util.Collection)} or {@link #withAwsServices(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param awsServices
     *        The AWS Services that the Check applies to
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSummary withAwsServices(String... awsServices) {
        if (this.awsServices == null) {
            setAwsServices(new java.util.ArrayList<String>(awsServices.length));
        }
        for (String ele : awsServices) {
            this.awsServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS Services that the Check applies to
     * </p>
     * 
     * @param awsServices
     *        The AWS Services that the Check applies to
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSummary withAwsServices(java.util.Collection<String> awsServices) {
        setAwsServices(awsServices);
        return this;
    }

    /**
     * <p>
     * A description of what the AWS Trusted Advisor Check is monitoring
     * </p>
     * 
     * @param description
     *        A description of what the AWS Trusted Advisor Check is monitoring
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of what the AWS Trusted Advisor Check is monitoring
     * </p>
     * 
     * @return A description of what the AWS Trusted Advisor Check is monitoring
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of what the AWS Trusted Advisor Check is monitoring
     * </p>
     * 
     * @param description
     *        A description of what the AWS Trusted Advisor Check is monitoring
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the AWS Trusted Advisor Check
     * </p>
     * 
     * @param id
     *        The unique identifier of the AWS Trusted Advisor Check
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the AWS Trusted Advisor Check
     * </p>
     * 
     * @return The unique identifier of the AWS Trusted Advisor Check
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the AWS Trusted Advisor Check
     * </p>
     * 
     * @param id
     *        The unique identifier of the AWS Trusted Advisor Check
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The column headings for the metadata returned in the resource
     * </p>
     * 
     * @return The column headings for the metadata returned in the resource
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The column headings for the metadata returned in the resource
     * </p>
     * 
     * @param metadata
     *        The column headings for the metadata returned in the resource
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The column headings for the metadata returned in the resource
     * </p>
     * 
     * @param metadata
     *        The column headings for the metadata returned in the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSummary withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see CheckSummary#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CheckSummary addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSummary clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The name of the AWS Trusted Advisor Check
     * </p>
     * 
     * @param name
     *        The name of the AWS Trusted Advisor Check
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AWS Trusted Advisor Check
     * </p>
     * 
     * @return The name of the AWS Trusted Advisor Check
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the AWS Trusted Advisor Check
     * </p>
     * 
     * @param name
     *        The name of the AWS Trusted Advisor Check
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * </p>
     * 
     * @return The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * @see RecommendationPillar
     */

    public java.util.List<String> getPillars() {
        return pillars;
    }

    /**
     * <p>
     * The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * </p>
     * 
     * @param pillars
     *        The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * @see RecommendationPillar
     */

    public void setPillars(java.util.Collection<String> pillars) {
        if (pillars == null) {
            this.pillars = null;
            return;
        }

        this.pillars = new java.util.ArrayList<String>(pillars);
    }

    /**
     * <p>
     * The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPillars(java.util.Collection)} or {@link #withPillars(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param pillars
     *        The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationPillar
     */

    public CheckSummary withPillars(String... pillars) {
        if (this.pillars == null) {
            setPillars(new java.util.ArrayList<String>(pillars.length));
        }
        for (String ele : pillars) {
            this.pillars.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * </p>
     * 
     * @param pillars
     *        The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationPillar
     */

    public CheckSummary withPillars(java.util.Collection<String> pillars) {
        setPillars(pillars);
        return this;
    }

    /**
     * <p>
     * The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * </p>
     * 
     * @param pillars
     *        The Recommendation pillars that the AWS Trusted Advisor Check falls under
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationPillar
     */

    public CheckSummary withPillars(RecommendationPillar... pillars) {
        java.util.ArrayList<String> pillarsCopy = new java.util.ArrayList<String>(pillars.length);
        for (RecommendationPillar value : pillars) {
            pillarsCopy.add(value.toString());
        }
        if (getPillars() == null) {
            setPillars(pillarsCopy);
        } else {
            getPillars().addAll(pillarsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The source of the Recommendation
     * </p>
     * 
     * @param source
     *        The source of the Recommendation
     * @see RecommendationSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the Recommendation
     * </p>
     * 
     * @return The source of the Recommendation
     * @see RecommendationSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the Recommendation
     * </p>
     * 
     * @param source
     *        The source of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSource
     */

    public CheckSummary withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The source of the Recommendation
     * </p>
     * 
     * @param source
     *        The source of the Recommendation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSource
     */

    public CheckSummary withSource(RecommendationSource source) {
        this.source = source.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAwsServices() != null)
            sb.append("AwsServices: ").append(getAwsServices()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPillars() != null)
            sb.append("Pillars: ").append(getPillars()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckSummary == false)
            return false;
        CheckSummary other = (CheckSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAwsServices() == null ^ this.getAwsServices() == null)
            return false;
        if (other.getAwsServices() != null && other.getAwsServices().equals(this.getAwsServices()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPillars() == null ^ this.getPillars() == null)
            return false;
        if (other.getPillars() != null && other.getPillars().equals(this.getPillars()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAwsServices() == null) ? 0 : getAwsServices().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPillars() == null) ? 0 : getPillars().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public CheckSummary clone() {
        try {
            return (CheckSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.trustedadvisor.model.transform.CheckSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
