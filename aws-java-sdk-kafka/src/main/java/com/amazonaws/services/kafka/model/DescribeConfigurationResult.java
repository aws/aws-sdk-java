/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/DescribeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the configuration was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The description of the configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The versions of Apache Kafka with which you can use this MSK configuration.
     * </p>
     */
    private java.util.List<String> kafkaVersions;
    /**
     * <p>
     * Latest revision of the configuration.
     * </p>
     */
    private ConfigurationRevision latestRevision;
    /**
     * <p>
     * The name of the configuration.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @param arn
     *        <p>
     *        The Amazon Resource Name (ARN) of the configuration.
     *        </p>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the configuration.
     *         </p>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @param arn
     *        <p>
     *        The Amazon Resource Name (ARN) of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the configuration was created.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The time when the configuration was created.
     *        </p>
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the configuration was created.
     * </p>
     * 
     * @return <p>
     *         The time when the configuration was created.
     *         </p>
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the configuration was created.
     * </p>
     * 
     * @param creationTime
     *        <p>
     *        The time when the configuration was created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The description of the configuration.
     * </p>
     * 
     * @param description
     *        <p>
     *        The description of the configuration.
     *        </p>
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the configuration.
     * </p>
     * 
     * @return <p>
     *         The description of the configuration.
     *         </p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the configuration.
     * </p>
     * 
     * @param description
     *        <p>
     *        The description of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The versions of Apache Kafka with which you can use this MSK configuration.
     * </p>
     * 
     * @return <p>
     *         The versions of Apache Kafka with which you can use this MSK configuration.
     *         </p>
     */

    public java.util.List<String> getKafkaVersions() {
        return kafkaVersions;
    }

    /**
     * <p>
     * The versions of Apache Kafka with which you can use this MSK configuration.
     * </p>
     * 
     * @param kafkaVersions
     *        <p>
     *        The versions of Apache Kafka with which you can use this MSK configuration.
     *        </p>
     */

    public void setKafkaVersions(java.util.Collection<String> kafkaVersions) {
        if (kafkaVersions == null) {
            this.kafkaVersions = null;
            return;
        }

        this.kafkaVersions = new java.util.ArrayList<String>(kafkaVersions);
    }

    /**
     * <p>
     * The versions of Apache Kafka with which you can use this MSK configuration.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKafkaVersions(java.util.Collection)} or {@link #withKafkaVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param kafkaVersions
     *        <p>
     *        The versions of Apache Kafka with which you can use this MSK configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withKafkaVersions(String... kafkaVersions) {
        if (this.kafkaVersions == null) {
            setKafkaVersions(new java.util.ArrayList<String>(kafkaVersions.length));
        }
        for (String ele : kafkaVersions) {
            this.kafkaVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The versions of Apache Kafka with which you can use this MSK configuration.
     * </p>
     * 
     * @param kafkaVersions
     *        <p>
     *        The versions of Apache Kafka with which you can use this MSK configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withKafkaVersions(java.util.Collection<String> kafkaVersions) {
        setKafkaVersions(kafkaVersions);
        return this;
    }

    /**
     * <p>
     * Latest revision of the configuration.
     * </p>
     * 
     * @param latestRevision
     *        <p>
     *        Latest revision of the configuration.
     *        </p>
     */

    public void setLatestRevision(ConfigurationRevision latestRevision) {
        this.latestRevision = latestRevision;
    }

    /**
     * <p>
     * Latest revision of the configuration.
     * </p>
     * 
     * @return <p>
     *         Latest revision of the configuration.
     *         </p>
     */

    public ConfigurationRevision getLatestRevision() {
        return this.latestRevision;
    }

    /**
     * <p>
     * Latest revision of the configuration.
     * </p>
     * 
     * @param latestRevision
     *        <p>
     *        Latest revision of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withLatestRevision(ConfigurationRevision latestRevision) {
        setLatestRevision(latestRevision);
        return this;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param name
     *        <p>
     *        The name of the configuration.
     *        </p>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @return <p>
     *         The name of the configuration.
     *         </p>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param name
     *        <p>
     *        The name of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationResult withName(String name) {
        setName(name);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKafkaVersions() != null)
            sb.append("KafkaVersions: ").append(getKafkaVersions()).append(",");
        if (getLatestRevision() != null)
            sb.append("LatestRevision: ").append(getLatestRevision()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationResult == false)
            return false;
        DescribeConfigurationResult other = (DescribeConfigurationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKafkaVersions() == null ^ this.getKafkaVersions() == null)
            return false;
        if (other.getKafkaVersions() != null && other.getKafkaVersions().equals(this.getKafkaVersions()) == false)
            return false;
        if (other.getLatestRevision() == null ^ this.getLatestRevision() == null)
            return false;
        if (other.getLatestRevision() != null && other.getLatestRevision().equals(this.getLatestRevision()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKafkaVersions() == null) ? 0 : getKafkaVersions().hashCode());
        hashCode = prime * hashCode + ((getLatestRevision() == null) ? 0 : getLatestRevision().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationResult clone() {
        try {
            return (DescribeConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
