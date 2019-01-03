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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a provisioning artifact (also known as a version) for a product.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisioningArtifactProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisioningArtifactProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the provisioning artifact, including how it differs from the previous provisioning artifact.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:
     * </p>
     * <p>
     * <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     * </p>
     */
    private java.util.Map<String, String> info;
    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
     * </p>
     * 
     * @param name
     *        The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
     * </p>
     * 
     * @return The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
     * </p>
     * 
     * @param name
     *        The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactProperties withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the provisioning artifact, including how it differs from the previous provisioning artifact.
     * </p>
     * 
     * @param description
     *        The description of the provisioning artifact, including how it differs from the previous provisioning
     *        artifact.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the provisioning artifact, including how it differs from the previous provisioning artifact.
     * </p>
     * 
     * @return The description of the provisioning artifact, including how it differs from the previous provisioning
     *         artifact.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the provisioning artifact, including how it differs from the previous provisioning artifact.
     * </p>
     * 
     * @param description
     *        The description of the provisioning artifact, including how it differs from the previous provisioning
     *        artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactProperties withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:
     * </p>
     * <p>
     * <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     * </p>
     * 
     * @return The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:</p>
     *         <p>
     *         <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     */

    public java.util.Map<String, String> getInfo() {
        return info;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:
     * </p>
     * <p>
     * <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     * </p>
     * 
     * @param info
     *        The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:</p>
     *        <p>
     *        <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     */

    public void setInfo(java.util.Map<String, String> info) {
        this.info = info;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:
     * </p>
     * <p>
     * <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     * </p>
     * 
     * @param info
     *        The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:</p>
     *        <p>
     *        <code>"LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..."</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactProperties withInfo(java.util.Map<String, String> info) {
        setInfo(info);
        return this;
    }

    public ProvisioningArtifactProperties addInfoEntry(String key, String value) {
        if (null == this.info) {
            this.info = new java.util.HashMap<String, String>();
        }
        if (this.info.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.info.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Info.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactProperties clearInfoEntries() {
        this.info = null;
        return this;
    }

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of provisioning artifact.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     *        </p>
     *        </li>
     * @see ProvisioningArtifactType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of provisioning artifact.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     *         </p>
     *         </li>
     * @see ProvisioningArtifactType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of provisioning artifact.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningArtifactType
     */

    public ProvisioningArtifactProperties withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of provisioning artifact.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     *        </p>
     *        </li>
     * @see ProvisioningArtifactType
     */

    public void setType(ProvisioningArtifactType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of provisioning artifact.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of provisioning artifact.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CLOUD_FORMATION_TEMPLATE</code> - AWS CloudFormation template
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE_AMI</code> - AWS Marketplace AMI
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MARKETPLACE_CAR</code> - AWS Marketplace Clusters and AWS Resources
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningArtifactType
     */

    public ProvisioningArtifactProperties withType(ProvisioningArtifactType type) {
        this.type = type.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInfo() != null)
            sb.append("Info: ").append(getInfo()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactProperties == false)
            return false;
        ProvisioningArtifactProperties other = (ProvisioningArtifactProperties) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInfo() == null ^ this.getInfo() == null)
            return false;
        if (other.getInfo() != null && other.getInfo().equals(this.getInfo()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInfo() == null) ? 0 : getInfo().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ProvisioningArtifactProperties clone() {
        try {
            return (ProvisioningArtifactProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProvisioningArtifactPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
