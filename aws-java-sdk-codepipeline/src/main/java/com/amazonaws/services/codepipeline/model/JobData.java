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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents additional information about a job required for a job worker to complete the job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/JobData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents information about an action type.
     * </p>
     */
    private ActionTypeId actionTypeId;
    /**
     * <p>
     * Represents information about an action configuration.
     * </p>
     */
    private ActionConfiguration actionConfiguration;
    /**
     * <p>
     * Represents information about a pipeline to a job worker.
     * </p>
     */
    private PipelineContext pipelineContext;
    /**
     * <p>
     * The artifact supplied to the job.
     * </p>
     */
    private java.util.List<Artifact> inputArtifacts;
    /**
     * <p>
     * The output of the job.
     * </p>
     */
    private java.util.List<Artifact> outputArtifacts;
    /**
     * <p>
     * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS
     * Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3 bucket used to
     * store artifact for the pipeline in AWS CodePipeline.
     * </p>
     */
    private AWSSessionCredentials artifactCredentials;
    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue the
     * job asynchronously.
     * </p>
     */
    private String continuationToken;
    /**
     * <p>
     * Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management
     * Service (AWS KMS) key.
     * </p>
     */
    private EncryptionKey encryptionKey;

    /**
     * <p>
     * Represents information about an action type.
     * </p>
     * 
     * @param actionTypeId
     *        Represents information about an action type.
     */

    public void setActionTypeId(ActionTypeId actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    /**
     * <p>
     * Represents information about an action type.
     * </p>
     * 
     * @return Represents information about an action type.
     */

    public ActionTypeId getActionTypeId() {
        return this.actionTypeId;
    }

    /**
     * <p>
     * Represents information about an action type.
     * </p>
     * 
     * @param actionTypeId
     *        Represents information about an action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobData withActionTypeId(ActionTypeId actionTypeId) {
        setActionTypeId(actionTypeId);
        return this;
    }

    /**
     * <p>
     * Represents information about an action configuration.
     * </p>
     * 
     * @param actionConfiguration
     *        Represents information about an action configuration.
     */

    public void setActionConfiguration(ActionConfiguration actionConfiguration) {
        this.actionConfiguration = actionConfiguration;
    }

    /**
     * <p>
     * Represents information about an action configuration.
     * </p>
     * 
     * @return Represents information about an action configuration.
     */

    public ActionConfiguration getActionConfiguration() {
        return this.actionConfiguration;
    }

    /**
     * <p>
     * Represents information about an action configuration.
     * </p>
     * 
     * @param actionConfiguration
     *        Represents information about an action configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobData withActionConfiguration(ActionConfiguration actionConfiguration) {
        setActionConfiguration(actionConfiguration);
        return this;
    }

    /**
     * <p>
     * Represents information about a pipeline to a job worker.
     * </p>
     * 
     * @param pipelineContext
     *        Represents information about a pipeline to a job worker.
     */

    public void setPipelineContext(PipelineContext pipelineContext) {
        this.pipelineContext = pipelineContext;
    }

    /**
     * <p>
     * Represents information about a pipeline to a job worker.
     * </p>
     * 
     * @return Represents information about a pipeline to a job worker.
     */

    public PipelineContext getPipelineContext() {
        return this.pipelineContext;
    }

    /**
     * <p>
     * Represents information about a pipeline to a job worker.
     * </p>
     * 
     * @param pipelineContext
     *        Represents information about a pipeline to a job worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobData withPipelineContext(PipelineContext pipelineContext) {
        setPipelineContext(pipelineContext);
        return this;
    }

    /**
     * <p>
     * The artifact supplied to the job.
     * </p>
     * 
     * @return The artifact supplied to the job.
     */

    public java.util.List<Artifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * The artifact supplied to the job.
     * </p>
     * 
     * @param inputArtifacts
     *        The artifact supplied to the job.
     */

    public void setInputArtifacts(java.util.Collection<Artifact> inputArtifacts) {
        if (inputArtifacts == null) {
            this.inputArtifacts = null;
            return;
        }

        this.inputArtifacts = new java.util.ArrayList<Artifact>(inputArtifacts);
    }

    /**
     * <p>
     * The artifact supplied to the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputArtifacts(java.util.Collection)} or {@link #withInputArtifacts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputArtifacts
     *        The artifact supplied to the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobData withInputArtifacts(Artifact... inputArtifacts) {
        if (this.inputArtifacts == null) {
            setInputArtifacts(new java.util.ArrayList<Artifact>(inputArtifacts.length));
        }
        for (Artifact ele : inputArtifacts) {
            this.inputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The artifact supplied to the job.
     * </p>
     * 
     * @param inputArtifacts
     *        The artifact supplied to the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobData withInputArtifacts(java.util.Collection<Artifact> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
        return this;
    }

    /**
     * <p>
     * The output of the job.
     * </p>
     * 
     * @return The output of the job.
     */

    public java.util.List<Artifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * The output of the job.
     * </p>
     * 
     * @param outputArtifacts
     *        The output of the job.
     */

    public void setOutputArtifacts(java.util.Collection<Artifact> outputArtifacts) {
        if (outputArtifacts == null) {
            this.outputArtifacts = null;
            return;
        }

        this.outputArtifacts = new java.util.ArrayList<Artifact>(outputArtifacts);
    }

    /**
     * <p>
     * The output of the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputArtifacts(java.util.Collection)} or {@link #withOutputArtifacts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param outputArtifacts
     *        The output of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobData withOutputArtifacts(Artifact... outputArtifacts) {
        if (this.outputArtifacts == null) {
            setOutputArtifacts(new java.util.ArrayList<Artifact>(outputArtifacts.length));
        }
        for (Artifact ele : outputArtifacts) {
            this.outputArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The output of the job.
     * </p>
     * 
     * @param outputArtifacts
     *        The output of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobData withOutputArtifacts(java.util.Collection<Artifact> outputArtifacts) {
        setOutputArtifacts(outputArtifacts);
        return this;
    }

    /**
     * <p>
     * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS
     * Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3 bucket used to
     * store artifact for the pipeline in AWS CodePipeline.
     * </p>
     * 
     * @param artifactCredentials
     *        Represents an AWS session credentials object. These credentials are temporary credentials that are issued
     *        by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3
     *        bucket used to store artifact for the pipeline in AWS CodePipeline.
     */

    public void setArtifactCredentials(AWSSessionCredentials artifactCredentials) {
        this.artifactCredentials = artifactCredentials;
    }

    /**
     * <p>
     * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS
     * Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3 bucket used to
     * store artifact for the pipeline in AWS CodePipeline.
     * </p>
     * 
     * @return Represents an AWS session credentials object. These credentials are temporary credentials that are issued
     *         by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3
     *         bucket used to store artifact for the pipeline in AWS CodePipeline.
     */

    public AWSSessionCredentials getArtifactCredentials() {
        return this.artifactCredentials;
    }

    /**
     * <p>
     * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS
     * Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3 bucket used to
     * store artifact for the pipeline in AWS CodePipeline.
     * </p>
     * 
     * @param artifactCredentials
     *        Represents an AWS session credentials object. These credentials are temporary credentials that are issued
     *        by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the Amazon S3
     *        bucket used to store artifact for the pipeline in AWS CodePipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobData withArtifactCredentials(AWSSessionCredentials artifactCredentials) {
        setArtifactCredentials(artifactCredentials);
        return this;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue the
     * job asynchronously.
     * </p>
     * 
     * @param continuationToken
     *        A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue
     *        the job asynchronously.
     */

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue the
     * job asynchronously.
     * </p>
     * 
     * @return A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to
     *         continue the job asynchronously.
     */

    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue the
     * job asynchronously.
     * </p>
     * 
     * @param continuationToken
     *        A system-generated token, such as a AWS CodeDeploy deployment ID, that a job requires in order to continue
     *        the job asynchronously.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobData withContinuationToken(String continuationToken) {
        setContinuationToken(continuationToken);
        return this;
    }

    /**
     * <p>
     * Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management
     * Service (AWS KMS) key.
     * </p>
     * 
     * @param encryptionKey
     *        Represents information about the key used to encrypt data in the artifact store, such as an AWS Key
     *        Management Service (AWS KMS) key.
     */

    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management
     * Service (AWS KMS) key.
     * </p>
     * 
     * @return Represents information about the key used to encrypt data in the artifact store, such as an AWS Key
     *         Management Service (AWS KMS) key.
     */

    public EncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management
     * Service (AWS KMS) key.
     * </p>
     * 
     * @param encryptionKey
     *        Represents information about the key used to encrypt data in the artifact store, such as an AWS Key
     *        Management Service (AWS KMS) key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobData withEncryptionKey(EncryptionKey encryptionKey) {
        setEncryptionKey(encryptionKey);
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
        if (getActionTypeId() != null)
            sb.append("ActionTypeId: ").append(getActionTypeId()).append(",");
        if (getActionConfiguration() != null)
            sb.append("ActionConfiguration: ").append(getActionConfiguration()).append(",");
        if (getPipelineContext() != null)
            sb.append("PipelineContext: ").append(getPipelineContext()).append(",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: ").append(getInputArtifacts()).append(",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: ").append(getOutputArtifacts()).append(",");
        if (getArtifactCredentials() != null)
            sb.append("ArtifactCredentials: ").append("***Sensitive Data Redacted***").append(",");
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: ").append(getContinuationToken()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobData == false)
            return false;
        JobData other = (JobData) obj;
        if (other.getActionTypeId() == null ^ this.getActionTypeId() == null)
            return false;
        if (other.getActionTypeId() != null && other.getActionTypeId().equals(this.getActionTypeId()) == false)
            return false;
        if (other.getActionConfiguration() == null ^ this.getActionConfiguration() == null)
            return false;
        if (other.getActionConfiguration() != null && other.getActionConfiguration().equals(this.getActionConfiguration()) == false)
            return false;
        if (other.getPipelineContext() == null ^ this.getPipelineContext() == null)
            return false;
        if (other.getPipelineContext() != null && other.getPipelineContext().equals(this.getPipelineContext()) == false)
            return false;
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        if (other.getOutputArtifacts() == null ^ this.getOutputArtifacts() == null)
            return false;
        if (other.getOutputArtifacts() != null && other.getOutputArtifacts().equals(this.getOutputArtifacts()) == false)
            return false;
        if (other.getArtifactCredentials() == null ^ this.getArtifactCredentials() == null)
            return false;
        if (other.getArtifactCredentials() != null && other.getArtifactCredentials().equals(this.getArtifactCredentials()) == false)
            return false;
        if (other.getContinuationToken() == null ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null && other.getContinuationToken().equals(this.getContinuationToken()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionTypeId() == null) ? 0 : getActionTypeId().hashCode());
        hashCode = prime * hashCode + ((getActionConfiguration() == null) ? 0 : getActionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPipelineContext() == null) ? 0 : getPipelineContext().hashCode());
        hashCode = prime * hashCode + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getArtifactCredentials() == null) ? 0 : getArtifactCredentials().hashCode());
        hashCode = prime * hashCode + ((getContinuationToken() == null) ? 0 : getContinuationToken().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        return hashCode;
    }

    @Override
    public JobData clone() {
        try {
            return (JobData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.JobDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
