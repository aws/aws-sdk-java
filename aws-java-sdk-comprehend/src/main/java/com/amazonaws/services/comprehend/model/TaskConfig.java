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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration about the model associated with a flywheel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/TaskConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Configuration required for a document classification model.
     * </p>
     */
    private DocumentClassificationConfig documentClassificationConfig;
    /**
     * <p>
     * Configuration required for an entity recognition model.
     * </p>
     */
    private EntityRecognitionConfig entityRecognitionConfig;

    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     * 
     * @param languageCode
     *        Language code for the language that the model supports.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     * 
     * @return Language code for the language that the model supports.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     * 
     * @param languageCode
     *        Language code for the language that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public TaskConfig withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     * 
     * @param languageCode
     *        Language code for the language that the model supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public TaskConfig withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Configuration required for a document classification model.
     * </p>
     * 
     * @param documentClassificationConfig
     *        Configuration required for a document classification model.
     */

    public void setDocumentClassificationConfig(DocumentClassificationConfig documentClassificationConfig) {
        this.documentClassificationConfig = documentClassificationConfig;
    }

    /**
     * <p>
     * Configuration required for a document classification model.
     * </p>
     * 
     * @return Configuration required for a document classification model.
     */

    public DocumentClassificationConfig getDocumentClassificationConfig() {
        return this.documentClassificationConfig;
    }

    /**
     * <p>
     * Configuration required for a document classification model.
     * </p>
     * 
     * @param documentClassificationConfig
     *        Configuration required for a document classification model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskConfig withDocumentClassificationConfig(DocumentClassificationConfig documentClassificationConfig) {
        setDocumentClassificationConfig(documentClassificationConfig);
        return this;
    }

    /**
     * <p>
     * Configuration required for an entity recognition model.
     * </p>
     * 
     * @param entityRecognitionConfig
     *        Configuration required for an entity recognition model.
     */

    public void setEntityRecognitionConfig(EntityRecognitionConfig entityRecognitionConfig) {
        this.entityRecognitionConfig = entityRecognitionConfig;
    }

    /**
     * <p>
     * Configuration required for an entity recognition model.
     * </p>
     * 
     * @return Configuration required for an entity recognition model.
     */

    public EntityRecognitionConfig getEntityRecognitionConfig() {
        return this.entityRecognitionConfig;
    }

    /**
     * <p>
     * Configuration required for an entity recognition model.
     * </p>
     * 
     * @param entityRecognitionConfig
     *        Configuration required for an entity recognition model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskConfig withEntityRecognitionConfig(EntityRecognitionConfig entityRecognitionConfig) {
        setEntityRecognitionConfig(entityRecognitionConfig);
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getDocumentClassificationConfig() != null)
            sb.append("DocumentClassificationConfig: ").append(getDocumentClassificationConfig()).append(",");
        if (getEntityRecognitionConfig() != null)
            sb.append("EntityRecognitionConfig: ").append(getEntityRecognitionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskConfig == false)
            return false;
        TaskConfig other = (TaskConfig) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getDocumentClassificationConfig() == null ^ this.getDocumentClassificationConfig() == null)
            return false;
        if (other.getDocumentClassificationConfig() != null && other.getDocumentClassificationConfig().equals(this.getDocumentClassificationConfig()) == false)
            return false;
        if (other.getEntityRecognitionConfig() == null ^ this.getEntityRecognitionConfig() == null)
            return false;
        if (other.getEntityRecognitionConfig() != null && other.getEntityRecognitionConfig().equals(this.getEntityRecognitionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getDocumentClassificationConfig() == null) ? 0 : getDocumentClassificationConfig().hashCode());
        hashCode = prime * hashCode + ((getEntityRecognitionConfig() == null) ? 0 : getEntityRecognitionConfig().hashCode());
        return hashCode;
    }

    @Override
    public TaskConfig clone() {
        try {
            return (TaskConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.TaskConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
