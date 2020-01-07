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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the result metrics for the test data associated with an documentation classifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ClassifierEvaluationMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassifierEvaluationMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fraction of the labels that were correct recognized. It is computed by dividing the number of labels in the
     * test documents that were correctly recognized by the total number of labels in the test documents.
     * </p>
     */
    private Double accuracy;
    /**
     * <p>
     * A measure of the usefulness of the classifier results in the test data. High precision means that the classifier
     * returned substantially more relevant results than irrelevant ones.
     * </p>
     */
    private Double precision;
    /**
     * <p>
     * A measure of how complete the classifier results are for the test data. High recall means that the classifier
     * returned most of the relevant results.
     * </p>
     */
    private Double recall;
    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data. It is derived from the
     * <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of the
     * two scores. The highest score is 1, and the worst score is 0.
     * </p>
     */
    private Double f1Score;
    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer
     * returned substantially more relevant results than irrelevant ones. Unlike the Precision metric which comes from
     * averaging the precision of all available labels, this is based on the overall score of all precision scores added
     * together.
     * </p>
     */
    private Double microPrecision;
    /**
     * <p>
     * A measure of how complete the classifier results are for the test data. High recall means that the classifier
     * returned most of the relevant results. Specifically, this indicates how many of the correct categories in the
     * text that the model can predict. It is a percentage of correct categories in the text that can found. Instead of
     * averaging the recall scores of all labels (as with Recall), micro Recall is based on the overall score of all
     * recall scores added together.
     * </p>
     */
    private Double microRecall;
    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data. It is a combination of the
     * <code>Micro Precision</code> and <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the harmonic
     * mean of the two scores. The highest score is 1, and the worst score is 0.
     * </p>
     */
    private Double microF1Score;
    /**
     * <p>
     * Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction of wrong labels
     * compared to the total number of labels. Scores closer to zero are better.
     * </p>
     */
    private Double hammingLoss;

    /**
     * <p>
     * The fraction of the labels that were correct recognized. It is computed by dividing the number of labels in the
     * test documents that were correctly recognized by the total number of labels in the test documents.
     * </p>
     * 
     * @param accuracy
     *        The fraction of the labels that were correct recognized. It is computed by dividing the number of labels
     *        in the test documents that were correctly recognized by the total number of labels in the test documents.
     */

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * <p>
     * The fraction of the labels that were correct recognized. It is computed by dividing the number of labels in the
     * test documents that were correctly recognized by the total number of labels in the test documents.
     * </p>
     * 
     * @return The fraction of the labels that were correct recognized. It is computed by dividing the number of labels
     *         in the test documents that were correctly recognized by the total number of labels in the test documents.
     */

    public Double getAccuracy() {
        return this.accuracy;
    }

    /**
     * <p>
     * The fraction of the labels that were correct recognized. It is computed by dividing the number of labels in the
     * test documents that were correctly recognized by the total number of labels in the test documents.
     * </p>
     * 
     * @param accuracy
     *        The fraction of the labels that were correct recognized. It is computed by dividing the number of labels
     *        in the test documents that were correctly recognized by the total number of labels in the test documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierEvaluationMetrics withAccuracy(Double accuracy) {
        setAccuracy(accuracy);
        return this;
    }

    /**
     * <p>
     * A measure of the usefulness of the classifier results in the test data. High precision means that the classifier
     * returned substantially more relevant results than irrelevant ones.
     * </p>
     * 
     * @param precision
     *        A measure of the usefulness of the classifier results in the test data. High precision means that the
     *        classifier returned substantially more relevant results than irrelevant ones.
     */

    public void setPrecision(Double precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * A measure of the usefulness of the classifier results in the test data. High precision means that the classifier
     * returned substantially more relevant results than irrelevant ones.
     * </p>
     * 
     * @return A measure of the usefulness of the classifier results in the test data. High precision means that the
     *         classifier returned substantially more relevant results than irrelevant ones.
     */

    public Double getPrecision() {
        return this.precision;
    }

    /**
     * <p>
     * A measure of the usefulness of the classifier results in the test data. High precision means that the classifier
     * returned substantially more relevant results than irrelevant ones.
     * </p>
     * 
     * @param precision
     *        A measure of the usefulness of the classifier results in the test data. High precision means that the
     *        classifier returned substantially more relevant results than irrelevant ones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierEvaluationMetrics withPrecision(Double precision) {
        setPrecision(precision);
        return this;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data. High recall means that the classifier
     * returned most of the relevant results.
     * </p>
     * 
     * @param recall
     *        A measure of how complete the classifier results are for the test data. High recall means that the
     *        classifier returned most of the relevant results.
     */

    public void setRecall(Double recall) {
        this.recall = recall;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data. High recall means that the classifier
     * returned most of the relevant results.
     * </p>
     * 
     * @return A measure of how complete the classifier results are for the test data. High recall means that the
     *         classifier returned most of the relevant results.
     */

    public Double getRecall() {
        return this.recall;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data. High recall means that the classifier
     * returned most of the relevant results.
     * </p>
     * 
     * @param recall
     *        A measure of how complete the classifier results are for the test data. High recall means that the
     *        classifier returned most of the relevant results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierEvaluationMetrics withRecall(Double recall) {
        setRecall(recall);
        return this;
    }

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data. It is derived from the
     * <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of the
     * two scores. The highest score is 1, and the worst score is 0.
     * </p>
     * 
     * @param f1Score
     *        A measure of how accurate the classifier results are for the test data. It is derived from the
     *        <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of
     *        the two scores. The highest score is 1, and the worst score is 0.
     */

    public void setF1Score(Double f1Score) {
        this.f1Score = f1Score;
    }

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data. It is derived from the
     * <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of the
     * two scores. The highest score is 1, and the worst score is 0.
     * </p>
     * 
     * @return A measure of how accurate the classifier results are for the test data. It is derived from the
     *         <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average
     *         of the two scores. The highest score is 1, and the worst score is 0.
     */

    public Double getF1Score() {
        return this.f1Score;
    }

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data. It is derived from the
     * <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of the
     * two scores. The highest score is 1, and the worst score is 0.
     * </p>
     * 
     * @param f1Score
     *        A measure of how accurate the classifier results are for the test data. It is derived from the
     *        <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of
     *        the two scores. The highest score is 1, and the worst score is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierEvaluationMetrics withF1Score(Double f1Score) {
        setF1Score(f1Score);
        return this;
    }

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer
     * returned substantially more relevant results than irrelevant ones. Unlike the Precision metric which comes from
     * averaging the precision of all available labels, this is based on the overall score of all precision scores added
     * together.
     * </p>
     * 
     * @param microPrecision
     *        A measure of the usefulness of the recognizer results in the test data. High precision means that the
     *        recognizer returned substantially more relevant results than irrelevant ones. Unlike the Precision metric
     *        which comes from averaging the precision of all available labels, this is based on the overall score of
     *        all precision scores added together.
     */

    public void setMicroPrecision(Double microPrecision) {
        this.microPrecision = microPrecision;
    }

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer
     * returned substantially more relevant results than irrelevant ones. Unlike the Precision metric which comes from
     * averaging the precision of all available labels, this is based on the overall score of all precision scores added
     * together.
     * </p>
     * 
     * @return A measure of the usefulness of the recognizer results in the test data. High precision means that the
     *         recognizer returned substantially more relevant results than irrelevant ones. Unlike the Precision metric
     *         which comes from averaging the precision of all available labels, this is based on the overall score of
     *         all precision scores added together.
     */

    public Double getMicroPrecision() {
        return this.microPrecision;
    }

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer
     * returned substantially more relevant results than irrelevant ones. Unlike the Precision metric which comes from
     * averaging the precision of all available labels, this is based on the overall score of all precision scores added
     * together.
     * </p>
     * 
     * @param microPrecision
     *        A measure of the usefulness of the recognizer results in the test data. High precision means that the
     *        recognizer returned substantially more relevant results than irrelevant ones. Unlike the Precision metric
     *        which comes from averaging the precision of all available labels, this is based on the overall score of
     *        all precision scores added together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierEvaluationMetrics withMicroPrecision(Double microPrecision) {
        setMicroPrecision(microPrecision);
        return this;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data. High recall means that the classifier
     * returned most of the relevant results. Specifically, this indicates how many of the correct categories in the
     * text that the model can predict. It is a percentage of correct categories in the text that can found. Instead of
     * averaging the recall scores of all labels (as with Recall), micro Recall is based on the overall score of all
     * recall scores added together.
     * </p>
     * 
     * @param microRecall
     *        A measure of how complete the classifier results are for the test data. High recall means that the
     *        classifier returned most of the relevant results. Specifically, this indicates how many of the correct
     *        categories in the text that the model can predict. It is a percentage of correct categories in the text
     *        that can found. Instead of averaging the recall scores of all labels (as with Recall), micro Recall is
     *        based on the overall score of all recall scores added together.
     */

    public void setMicroRecall(Double microRecall) {
        this.microRecall = microRecall;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data. High recall means that the classifier
     * returned most of the relevant results. Specifically, this indicates how many of the correct categories in the
     * text that the model can predict. It is a percentage of correct categories in the text that can found. Instead of
     * averaging the recall scores of all labels (as with Recall), micro Recall is based on the overall score of all
     * recall scores added together.
     * </p>
     * 
     * @return A measure of how complete the classifier results are for the test data. High recall means that the
     *         classifier returned most of the relevant results. Specifically, this indicates how many of the correct
     *         categories in the text that the model can predict. It is a percentage of correct categories in the text
     *         that can found. Instead of averaging the recall scores of all labels (as with Recall), micro Recall is
     *         based on the overall score of all recall scores added together.
     */

    public Double getMicroRecall() {
        return this.microRecall;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data. High recall means that the classifier
     * returned most of the relevant results. Specifically, this indicates how many of the correct categories in the
     * text that the model can predict. It is a percentage of correct categories in the text that can found. Instead of
     * averaging the recall scores of all labels (as with Recall), micro Recall is based on the overall score of all
     * recall scores added together.
     * </p>
     * 
     * @param microRecall
     *        A measure of how complete the classifier results are for the test data. High recall means that the
     *        classifier returned most of the relevant results. Specifically, this indicates how many of the correct
     *        categories in the text that the model can predict. It is a percentage of correct categories in the text
     *        that can found. Instead of averaging the recall scores of all labels (as with Recall), micro Recall is
     *        based on the overall score of all recall scores added together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierEvaluationMetrics withMicroRecall(Double microRecall) {
        setMicroRecall(microRecall);
        return this;
    }

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data. It is a combination of the
     * <code>Micro Precision</code> and <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the harmonic
     * mean of the two scores. The highest score is 1, and the worst score is 0.
     * </p>
     * 
     * @param microF1Score
     *        A measure of how accurate the classifier results are for the test data. It is a combination of the
     *        <code>Micro Precision</code> and <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the
     *        harmonic mean of the two scores. The highest score is 1, and the worst score is 0.
     */

    public void setMicroF1Score(Double microF1Score) {
        this.microF1Score = microF1Score;
    }

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data. It is a combination of the
     * <code>Micro Precision</code> and <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the harmonic
     * mean of the two scores. The highest score is 1, and the worst score is 0.
     * </p>
     * 
     * @return A measure of how accurate the classifier results are for the test data. It is a combination of the
     *         <code>Micro Precision</code> and <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the
     *         harmonic mean of the two scores. The highest score is 1, and the worst score is 0.
     */

    public Double getMicroF1Score() {
        return this.microF1Score;
    }

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data. It is a combination of the
     * <code>Micro Precision</code> and <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the harmonic
     * mean of the two scores. The highest score is 1, and the worst score is 0.
     * </p>
     * 
     * @param microF1Score
     *        A measure of how accurate the classifier results are for the test data. It is a combination of the
     *        <code>Micro Precision</code> and <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the
     *        harmonic mean of the two scores. The highest score is 1, and the worst score is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierEvaluationMetrics withMicroF1Score(Double microF1Score) {
        setMicroF1Score(microF1Score);
        return this;
    }

    /**
     * <p>
     * Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction of wrong labels
     * compared to the total number of labels. Scores closer to zero are better.
     * </p>
     * 
     * @param hammingLoss
     *        Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction of wrong labels
     *        compared to the total number of labels. Scores closer to zero are better.
     */

    public void setHammingLoss(Double hammingLoss) {
        this.hammingLoss = hammingLoss;
    }

    /**
     * <p>
     * Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction of wrong labels
     * compared to the total number of labels. Scores closer to zero are better.
     * </p>
     * 
     * @return Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction of wrong
     *         labels compared to the total number of labels. Scores closer to zero are better.
     */

    public Double getHammingLoss() {
        return this.hammingLoss;
    }

    /**
     * <p>
     * Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction of wrong labels
     * compared to the total number of labels. Scores closer to zero are better.
     * </p>
     * 
     * @param hammingLoss
     *        Indicates the fraction of labels that are incorrectly predicted. Also seen as the fraction of wrong labels
     *        compared to the total number of labels. Scores closer to zero are better.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClassifierEvaluationMetrics withHammingLoss(Double hammingLoss) {
        setHammingLoss(hammingLoss);
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
        if (getAccuracy() != null)
            sb.append("Accuracy: ").append(getAccuracy()).append(",");
        if (getPrecision() != null)
            sb.append("Precision: ").append(getPrecision()).append(",");
        if (getRecall() != null)
            sb.append("Recall: ").append(getRecall()).append(",");
        if (getF1Score() != null)
            sb.append("F1Score: ").append(getF1Score()).append(",");
        if (getMicroPrecision() != null)
            sb.append("MicroPrecision: ").append(getMicroPrecision()).append(",");
        if (getMicroRecall() != null)
            sb.append("MicroRecall: ").append(getMicroRecall()).append(",");
        if (getMicroF1Score() != null)
            sb.append("MicroF1Score: ").append(getMicroF1Score()).append(",");
        if (getHammingLoss() != null)
            sb.append("HammingLoss: ").append(getHammingLoss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassifierEvaluationMetrics == false)
            return false;
        ClassifierEvaluationMetrics other = (ClassifierEvaluationMetrics) obj;
        if (other.getAccuracy() == null ^ this.getAccuracy() == null)
            return false;
        if (other.getAccuracy() != null && other.getAccuracy().equals(this.getAccuracy()) == false)
            return false;
        if (other.getPrecision() == null ^ this.getPrecision() == null)
            return false;
        if (other.getPrecision() != null && other.getPrecision().equals(this.getPrecision()) == false)
            return false;
        if (other.getRecall() == null ^ this.getRecall() == null)
            return false;
        if (other.getRecall() != null && other.getRecall().equals(this.getRecall()) == false)
            return false;
        if (other.getF1Score() == null ^ this.getF1Score() == null)
            return false;
        if (other.getF1Score() != null && other.getF1Score().equals(this.getF1Score()) == false)
            return false;
        if (other.getMicroPrecision() == null ^ this.getMicroPrecision() == null)
            return false;
        if (other.getMicroPrecision() != null && other.getMicroPrecision().equals(this.getMicroPrecision()) == false)
            return false;
        if (other.getMicroRecall() == null ^ this.getMicroRecall() == null)
            return false;
        if (other.getMicroRecall() != null && other.getMicroRecall().equals(this.getMicroRecall()) == false)
            return false;
        if (other.getMicroF1Score() == null ^ this.getMicroF1Score() == null)
            return false;
        if (other.getMicroF1Score() != null && other.getMicroF1Score().equals(this.getMicroF1Score()) == false)
            return false;
        if (other.getHammingLoss() == null ^ this.getHammingLoss() == null)
            return false;
        if (other.getHammingLoss() != null && other.getHammingLoss().equals(this.getHammingLoss()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccuracy() == null) ? 0 : getAccuracy().hashCode());
        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getRecall() == null) ? 0 : getRecall().hashCode());
        hashCode = prime * hashCode + ((getF1Score() == null) ? 0 : getF1Score().hashCode());
        hashCode = prime * hashCode + ((getMicroPrecision() == null) ? 0 : getMicroPrecision().hashCode());
        hashCode = prime * hashCode + ((getMicroRecall() == null) ? 0 : getMicroRecall().hashCode());
        hashCode = prime * hashCode + ((getMicroF1Score() == null) ? 0 : getMicroF1Score().hashCode());
        hashCode = prime * hashCode + ((getHammingLoss() == null) ? 0 : getHammingLoss().hashCode());
        return hashCode;
    }

    @Override
    public ClassifierEvaluationMetrics clone() {
        try {
            return (ClassifierEvaluationMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.ClassifierEvaluationMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
