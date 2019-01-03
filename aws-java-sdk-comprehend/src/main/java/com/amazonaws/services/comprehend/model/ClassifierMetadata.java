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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a document classifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ClassifierMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassifierMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of labels in the input data.
     * </p>
     */
    private Integer numberOfLabels;
    /**
     * <p>
     * The number of documents in the input data that were used to train the classifier. Typically this is 80 to 90
     * percent of the input documents.
     * </p>
     */
    private Integer numberOfTrainedDocuments;
    /**
     * <p>
     * The number of documents in the input data that were used to test the classifier. Typically this is 10 to 20
     * percent of the input documents.
     * </p>
     */
    private Integer numberOfTestDocuments;
    /**
     * <p>
     * Describes the result metrics for the test data associated with an documentation classifier.
     * </p>
     */
    private ClassifierEvaluationMetrics evaluationMetrics;

    /**
     * <p>
     * The number of labels in the input data.
     * </p>
     * 
     * @param numberOfLabels
     *        The number of labels in the input data.
     */

    public void setNumberOfLabels(Integer numberOfLabels) {
        this.numberOfLabels = numberOfLabels;
    }

    /**
     * <p>
     * The number of labels in the input data.
     * </p>
     * 
     * @return The number of labels in the input data.
     */

    public Integer getNumberOfLabels() {
        return this.numberOfLabels;
    }

    /**
     * <p>
     * The number of labels in the input data.
     * </p>
     * 
     * @param numberOfLabels
     *        The number of labels in the input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierMetadata withNumberOfLabels(Integer numberOfLabels) {
        setNumberOfLabels(numberOfLabels);
        return this;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to train the classifier. Typically this is 80 to 90
     * percent of the input documents.
     * </p>
     * 
     * @param numberOfTrainedDocuments
     *        The number of documents in the input data that were used to train the classifier. Typically this is 80 to
     *        90 percent of the input documents.
     */

    public void setNumberOfTrainedDocuments(Integer numberOfTrainedDocuments) {
        this.numberOfTrainedDocuments = numberOfTrainedDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to train the classifier. Typically this is 80 to 90
     * percent of the input documents.
     * </p>
     * 
     * @return The number of documents in the input data that were used to train the classifier. Typically this is 80 to
     *         90 percent of the input documents.
     */

    public Integer getNumberOfTrainedDocuments() {
        return this.numberOfTrainedDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to train the classifier. Typically this is 80 to 90
     * percent of the input documents.
     * </p>
     * 
     * @param numberOfTrainedDocuments
     *        The number of documents in the input data that were used to train the classifier. Typically this is 80 to
     *        90 percent of the input documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierMetadata withNumberOfTrainedDocuments(Integer numberOfTrainedDocuments) {
        setNumberOfTrainedDocuments(numberOfTrainedDocuments);
        return this;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the classifier. Typically this is 10 to 20
     * percent of the input documents.
     * </p>
     * 
     * @param numberOfTestDocuments
     *        The number of documents in the input data that were used to test the classifier. Typically this is 10 to
     *        20 percent of the input documents.
     */

    public void setNumberOfTestDocuments(Integer numberOfTestDocuments) {
        this.numberOfTestDocuments = numberOfTestDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the classifier. Typically this is 10 to 20
     * percent of the input documents.
     * </p>
     * 
     * @return The number of documents in the input data that were used to test the classifier. Typically this is 10 to
     *         20 percent of the input documents.
     */

    public Integer getNumberOfTestDocuments() {
        return this.numberOfTestDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the classifier. Typically this is 10 to 20
     * percent of the input documents.
     * </p>
     * 
     * @param numberOfTestDocuments
     *        The number of documents in the input data that were used to test the classifier. Typically this is 10 to
     *        20 percent of the input documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierMetadata withNumberOfTestDocuments(Integer numberOfTestDocuments) {
        setNumberOfTestDocuments(numberOfTestDocuments);
        return this;
    }

    /**
     * <p>
     * Describes the result metrics for the test data associated with an documentation classifier.
     * </p>
     * 
     * @param evaluationMetrics
     *        Describes the result metrics for the test data associated with an documentation classifier.
     */

    public void setEvaluationMetrics(ClassifierEvaluationMetrics evaluationMetrics) {
        this.evaluationMetrics = evaluationMetrics;
    }

    /**
     * <p>
     * Describes the result metrics for the test data associated with an documentation classifier.
     * </p>
     * 
     * @return Describes the result metrics for the test data associated with an documentation classifier.
     */

    public ClassifierEvaluationMetrics getEvaluationMetrics() {
        return this.evaluationMetrics;
    }

    /**
     * <p>
     * Describes the result metrics for the test data associated with an documentation classifier.
     * </p>
     * 
     * @param evaluationMetrics
     *        Describes the result metrics for the test data associated with an documentation classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierMetadata withEvaluationMetrics(ClassifierEvaluationMetrics evaluationMetrics) {
        setEvaluationMetrics(evaluationMetrics);
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
        if (getNumberOfLabels() != null)
            sb.append("NumberOfLabels: ").append(getNumberOfLabels()).append(",");
        if (getNumberOfTrainedDocuments() != null)
            sb.append("NumberOfTrainedDocuments: ").append(getNumberOfTrainedDocuments()).append(",");
        if (getNumberOfTestDocuments() != null)
            sb.append("NumberOfTestDocuments: ").append(getNumberOfTestDocuments()).append(",");
        if (getEvaluationMetrics() != null)
            sb.append("EvaluationMetrics: ").append(getEvaluationMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassifierMetadata == false)
            return false;
        ClassifierMetadata other = (ClassifierMetadata) obj;
        if (other.getNumberOfLabels() == null ^ this.getNumberOfLabels() == null)
            return false;
        if (other.getNumberOfLabels() != null && other.getNumberOfLabels().equals(this.getNumberOfLabels()) == false)
            return false;
        if (other.getNumberOfTrainedDocuments() == null ^ this.getNumberOfTrainedDocuments() == null)
            return false;
        if (other.getNumberOfTrainedDocuments() != null && other.getNumberOfTrainedDocuments().equals(this.getNumberOfTrainedDocuments()) == false)
            return false;
        if (other.getNumberOfTestDocuments() == null ^ this.getNumberOfTestDocuments() == null)
            return false;
        if (other.getNumberOfTestDocuments() != null && other.getNumberOfTestDocuments().equals(this.getNumberOfTestDocuments()) == false)
            return false;
        if (other.getEvaluationMetrics() == null ^ this.getEvaluationMetrics() == null)
            return false;
        if (other.getEvaluationMetrics() != null && other.getEvaluationMetrics().equals(this.getEvaluationMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfLabels() == null) ? 0 : getNumberOfLabels().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTrainedDocuments() == null) ? 0 : getNumberOfTrainedDocuments().hashCode());
        hashCode = prime * hashCode + ((getNumberOfTestDocuments() == null) ? 0 : getNumberOfTestDocuments().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMetrics() == null) ? 0 : getEvaluationMetrics().hashCode());
        return hashCode;
    }

    @Override
    public ClassifierMetadata clone() {
        try {
            return (ClassifierMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.ClassifierMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
