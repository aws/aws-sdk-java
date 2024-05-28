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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The analysis template within a collaboration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CollaborationAnalysisTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollaborationAnalysisTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the analysis template.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A unique identifier for the collaboration that the analysis templates belong to. Currently accepts collaboration
     * ID.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The unique ARN for the analysis template’s associated collaboration.
     * </p>
     */
    private String collaborationArn;
    /**
     * <p>
     * The description of the analysis template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     */
    private String creatorAccountId;
    /**
     * <p>
     * The name of the analysis template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time that the analysis template within a collaboration was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time that the analysis template in the collaboration was last updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The entire schema object.
     * </p>
     */
    private AnalysisSchema schema;
    /**
     * <p>
     * The format of the analysis template in the collaboration.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The source of the analysis template within a collaboration.
     * </p>
     */
    private AnalysisSource source;
    /**
     * <p>
     * The analysis parameters that have been specified in the analysis template.
     * </p>
     */
    private java.util.List<AnalysisParameter> analysisParameters;
    /**
     * <p>
     * The validations that were performed.
     * </p>
     */
    private java.util.List<AnalysisTemplateValidationStatusDetail> validations;

    /**
     * <p>
     * The identifier of the analysis template.
     * </p>
     * 
     * @param id
     *        The identifier of the analysis template.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the analysis template.
     * </p>
     * 
     * @return The identifier of the analysis template.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the analysis template.
     * </p>
     * 
     * @param id
     *        The identifier of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the analysis template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the analysis template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the analysis template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the analysis templates belong to. Currently accepts collaboration
     * ID.
     * </p>
     * 
     * @param collaborationId
     *        A unique identifier for the collaboration that the analysis templates belong to. Currently accepts
     *        collaboration ID.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the analysis templates belong to. Currently accepts collaboration
     * ID.
     * </p>
     * 
     * @return A unique identifier for the collaboration that the analysis templates belong to. Currently accepts
     *         collaboration ID.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * A unique identifier for the collaboration that the analysis templates belong to. Currently accepts collaboration
     * ID.
     * </p>
     * 
     * @param collaborationId
     *        A unique identifier for the collaboration that the analysis templates belong to. Currently accepts
     *        collaboration ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the analysis template’s associated collaboration.
     * </p>
     * 
     * @param collaborationArn
     *        The unique ARN for the analysis template’s associated collaboration.
     */

    public void setCollaborationArn(String collaborationArn) {
        this.collaborationArn = collaborationArn;
    }

    /**
     * <p>
     * The unique ARN for the analysis template’s associated collaboration.
     * </p>
     * 
     * @return The unique ARN for the analysis template’s associated collaboration.
     */

    public String getCollaborationArn() {
        return this.collaborationArn;
    }

    /**
     * <p>
     * The unique ARN for the analysis template’s associated collaboration.
     * </p>
     * 
     * @param collaborationArn
     *        The unique ARN for the analysis template’s associated collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withCollaborationArn(String collaborationArn) {
        setCollaborationArn(collaborationArn);
        return this;
    }

    /**
     * <p>
     * The description of the analysis template.
     * </p>
     * 
     * @param description
     *        The description of the analysis template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the analysis template.
     * </p>
     * 
     * @return The description of the analysis template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the analysis template.
     * </p>
     * 
     * @param description
     *        The description of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     * 
     * @param creatorAccountId
     *        The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     *        account ID.
     */

    public void setCreatorAccountId(String creatorAccountId) {
        this.creatorAccountId = creatorAccountId;
    }

    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     * 
     * @return The identifier used to reference members of the collaboration. Currently only supports Amazon Web
     *         Services account ID.
     */

    public String getCreatorAccountId() {
        return this.creatorAccountId;
    }

    /**
     * <p>
     * The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     * account ID.
     * </p>
     * 
     * @param creatorAccountId
     *        The identifier used to reference members of the collaboration. Currently only supports Amazon Web Services
     *        account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withCreatorAccountId(String creatorAccountId) {
        setCreatorAccountId(creatorAccountId);
        return this;
    }

    /**
     * <p>
     * The name of the analysis template.
     * </p>
     * 
     * @param name
     *        The name of the analysis template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the analysis template.
     * </p>
     * 
     * @return The name of the analysis template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the analysis template.
     * </p>
     * 
     * @param name
     *        The name of the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time that the analysis template within a collaboration was created.
     * </p>
     * 
     * @param createTime
     *        The time that the analysis template within a collaboration was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time that the analysis template within a collaboration was created.
     * </p>
     * 
     * @return The time that the analysis template within a collaboration was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time that the analysis template within a collaboration was created.
     * </p>
     * 
     * @param createTime
     *        The time that the analysis template within a collaboration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time that the analysis template in the collaboration was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time that the analysis template in the collaboration was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time that the analysis template in the collaboration was last updated.
     * </p>
     * 
     * @return The time that the analysis template in the collaboration was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time that the analysis template in the collaboration was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time that the analysis template in the collaboration was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The entire schema object.
     * </p>
     * 
     * @param schema
     *        The entire schema object.
     */

    public void setSchema(AnalysisSchema schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The entire schema object.
     * </p>
     * 
     * @return The entire schema object.
     */

    public AnalysisSchema getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The entire schema object.
     * </p>
     * 
     * @param schema
     *        The entire schema object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withSchema(AnalysisSchema schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The format of the analysis template in the collaboration.
     * </p>
     * 
     * @param format
     *        The format of the analysis template in the collaboration.
     * @see AnalysisFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the analysis template in the collaboration.
     * </p>
     * 
     * @return The format of the analysis template in the collaboration.
     * @see AnalysisFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the analysis template in the collaboration.
     * </p>
     * 
     * @param format
     *        The format of the analysis template in the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisFormat
     */

    public CollaborationAnalysisTemplate withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the analysis template in the collaboration.
     * </p>
     * 
     * @param format
     *        The format of the analysis template in the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisFormat
     */

    public CollaborationAnalysisTemplate withFormat(AnalysisFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The source of the analysis template within a collaboration.
     * </p>
     * 
     * @param source
     *        The source of the analysis template within a collaboration.
     */

    public void setSource(AnalysisSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the analysis template within a collaboration.
     * </p>
     * 
     * @return The source of the analysis template within a collaboration.
     */

    public AnalysisSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the analysis template within a collaboration.
     * </p>
     * 
     * @param source
     *        The source of the analysis template within a collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withSource(AnalysisSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The analysis parameters that have been specified in the analysis template.
     * </p>
     * 
     * @return The analysis parameters that have been specified in the analysis template.
     */

    public java.util.List<AnalysisParameter> getAnalysisParameters() {
        return analysisParameters;
    }

    /**
     * <p>
     * The analysis parameters that have been specified in the analysis template.
     * </p>
     * 
     * @param analysisParameters
     *        The analysis parameters that have been specified in the analysis template.
     */

    public void setAnalysisParameters(java.util.Collection<AnalysisParameter> analysisParameters) {
        if (analysisParameters == null) {
            this.analysisParameters = null;
            return;
        }

        this.analysisParameters = new java.util.ArrayList<AnalysisParameter>(analysisParameters);
    }

    /**
     * <p>
     * The analysis parameters that have been specified in the analysis template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisParameters(java.util.Collection)} or {@link #withAnalysisParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param analysisParameters
     *        The analysis parameters that have been specified in the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withAnalysisParameters(AnalysisParameter... analysisParameters) {
        if (this.analysisParameters == null) {
            setAnalysisParameters(new java.util.ArrayList<AnalysisParameter>(analysisParameters.length));
        }
        for (AnalysisParameter ele : analysisParameters) {
            this.analysisParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The analysis parameters that have been specified in the analysis template.
     * </p>
     * 
     * @param analysisParameters
     *        The analysis parameters that have been specified in the analysis template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withAnalysisParameters(java.util.Collection<AnalysisParameter> analysisParameters) {
        setAnalysisParameters(analysisParameters);
        return this;
    }

    /**
     * <p>
     * The validations that were performed.
     * </p>
     * 
     * @return The validations that were performed.
     */

    public java.util.List<AnalysisTemplateValidationStatusDetail> getValidations() {
        return validations;
    }

    /**
     * <p>
     * The validations that were performed.
     * </p>
     * 
     * @param validations
     *        The validations that were performed.
     */

    public void setValidations(java.util.Collection<AnalysisTemplateValidationStatusDetail> validations) {
        if (validations == null) {
            this.validations = null;
            return;
        }

        this.validations = new java.util.ArrayList<AnalysisTemplateValidationStatusDetail>(validations);
    }

    /**
     * <p>
     * The validations that were performed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidations(java.util.Collection)} or {@link #withValidations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param validations
     *        The validations that were performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withValidations(AnalysisTemplateValidationStatusDetail... validations) {
        if (this.validations == null) {
            setValidations(new java.util.ArrayList<AnalysisTemplateValidationStatusDetail>(validations.length));
        }
        for (AnalysisTemplateValidationStatusDetail ele : validations) {
            this.validations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The validations that were performed.
     * </p>
     * 
     * @param validations
     *        The validations that were performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CollaborationAnalysisTemplate withValidations(java.util.Collection<AnalysisTemplateValidationStatusDetail> validations) {
        setValidations(validations);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getCollaborationArn() != null)
            sb.append("CollaborationArn: ").append(getCollaborationArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatorAccountId() != null)
            sb.append("CreatorAccountId: ").append(getCreatorAccountId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append("***Sensitive Data Redacted***").append(",");
        if (getAnalysisParameters() != null)
            sb.append("AnalysisParameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getValidations() != null)
            sb.append("Validations: ").append(getValidations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CollaborationAnalysisTemplate == false)
            return false;
        CollaborationAnalysisTemplate other = (CollaborationAnalysisTemplate) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getCollaborationArn() == null ^ this.getCollaborationArn() == null)
            return false;
        if (other.getCollaborationArn() != null && other.getCollaborationArn().equals(this.getCollaborationArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatorAccountId() == null ^ this.getCreatorAccountId() == null)
            return false;
        if (other.getCreatorAccountId() != null && other.getCreatorAccountId().equals(this.getCreatorAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getAnalysisParameters() == null ^ this.getAnalysisParameters() == null)
            return false;
        if (other.getAnalysisParameters() != null && other.getAnalysisParameters().equals(this.getAnalysisParameters()) == false)
            return false;
        if (other.getValidations() == null ^ this.getValidations() == null)
            return false;
        if (other.getValidations() != null && other.getValidations().equals(this.getValidations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getCollaborationArn() == null) ? 0 : getCollaborationArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatorAccountId() == null) ? 0 : getCreatorAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getAnalysisParameters() == null) ? 0 : getAnalysisParameters().hashCode());
        hashCode = prime * hashCode + ((getValidations() == null) ? 0 : getValidations().hashCode());
        return hashCode;
    }

    @Override
    public CollaborationAnalysisTemplate clone() {
        try {
            return (CollaborationAnalysisTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.CollaborationAnalysisTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
