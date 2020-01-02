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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The confusion matrix shows you what your transform is predicting accurately and what types of errors it is making.
 * </p>
 * <p>
 * For more information, see <a href="https://en.wikipedia.org/wiki/Confusion_matrix">Confusion matrix</a> in Wikipedia.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ConfusionMatrix" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfusionMatrix implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of matches in the data that the transform correctly found, in the confusion matrix for your transform.
     * </p>
     */
    private Long numTruePositives;
    /**
     * <p>
     * The number of nonmatches in the data that the transform incorrectly classified as a match, in the confusion
     * matrix for your transform.
     * </p>
     */
    private Long numFalsePositives;
    /**
     * <p>
     * The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for your
     * transform.
     * </p>
     */
    private Long numTrueNegatives;
    /**
     * <p>
     * The number of matches in the data that the transform didn't find, in the confusion matrix for your transform.
     * </p>
     */
    private Long numFalseNegatives;

    /**
     * <p>
     * The number of matches in the data that the transform correctly found, in the confusion matrix for your transform.
     * </p>
     * 
     * @param numTruePositives
     *        The number of matches in the data that the transform correctly found, in the confusion matrix for your
     *        transform.
     */

    public void setNumTruePositives(Long numTruePositives) {
        this.numTruePositives = numTruePositives;
    }

    /**
     * <p>
     * The number of matches in the data that the transform correctly found, in the confusion matrix for your transform.
     * </p>
     * 
     * @return The number of matches in the data that the transform correctly found, in the confusion matrix for your
     *         transform.
     */

    public Long getNumTruePositives() {
        return this.numTruePositives;
    }

    /**
     * <p>
     * The number of matches in the data that the transform correctly found, in the confusion matrix for your transform.
     * </p>
     * 
     * @param numTruePositives
     *        The number of matches in the data that the transform correctly found, in the confusion matrix for your
     *        transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfusionMatrix withNumTruePositives(Long numTruePositives) {
        setNumTruePositives(numTruePositives);
        return this;
    }

    /**
     * <p>
     * The number of nonmatches in the data that the transform incorrectly classified as a match, in the confusion
     * matrix for your transform.
     * </p>
     * 
     * @param numFalsePositives
     *        The number of nonmatches in the data that the transform incorrectly classified as a match, in the
     *        confusion matrix for your transform.
     */

    public void setNumFalsePositives(Long numFalsePositives) {
        this.numFalsePositives = numFalsePositives;
    }

    /**
     * <p>
     * The number of nonmatches in the data that the transform incorrectly classified as a match, in the confusion
     * matrix for your transform.
     * </p>
     * 
     * @return The number of nonmatches in the data that the transform incorrectly classified as a match, in the
     *         confusion matrix for your transform.
     */

    public Long getNumFalsePositives() {
        return this.numFalsePositives;
    }

    /**
     * <p>
     * The number of nonmatches in the data that the transform incorrectly classified as a match, in the confusion
     * matrix for your transform.
     * </p>
     * 
     * @param numFalsePositives
     *        The number of nonmatches in the data that the transform incorrectly classified as a match, in the
     *        confusion matrix for your transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfusionMatrix withNumFalsePositives(Long numFalsePositives) {
        setNumFalsePositives(numFalsePositives);
        return this;
    }

    /**
     * <p>
     * The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for your
     * transform.
     * </p>
     * 
     * @param numTrueNegatives
     *        The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for
     *        your transform.
     */

    public void setNumTrueNegatives(Long numTrueNegatives) {
        this.numTrueNegatives = numTrueNegatives;
    }

    /**
     * <p>
     * The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for your
     * transform.
     * </p>
     * 
     * @return The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for
     *         your transform.
     */

    public Long getNumTrueNegatives() {
        return this.numTrueNegatives;
    }

    /**
     * <p>
     * The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for your
     * transform.
     * </p>
     * 
     * @param numTrueNegatives
     *        The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for
     *        your transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfusionMatrix withNumTrueNegatives(Long numTrueNegatives) {
        setNumTrueNegatives(numTrueNegatives);
        return this;
    }

    /**
     * <p>
     * The number of matches in the data that the transform didn't find, in the confusion matrix for your transform.
     * </p>
     * 
     * @param numFalseNegatives
     *        The number of matches in the data that the transform didn't find, in the confusion matrix for your
     *        transform.
     */

    public void setNumFalseNegatives(Long numFalseNegatives) {
        this.numFalseNegatives = numFalseNegatives;
    }

    /**
     * <p>
     * The number of matches in the data that the transform didn't find, in the confusion matrix for your transform.
     * </p>
     * 
     * @return The number of matches in the data that the transform didn't find, in the confusion matrix for your
     *         transform.
     */

    public Long getNumFalseNegatives() {
        return this.numFalseNegatives;
    }

    /**
     * <p>
     * The number of matches in the data that the transform didn't find, in the confusion matrix for your transform.
     * </p>
     * 
     * @param numFalseNegatives
     *        The number of matches in the data that the transform didn't find, in the confusion matrix for your
     *        transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfusionMatrix withNumFalseNegatives(Long numFalseNegatives) {
        setNumFalseNegatives(numFalseNegatives);
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
        if (getNumTruePositives() != null)
            sb.append("NumTruePositives: ").append(getNumTruePositives()).append(",");
        if (getNumFalsePositives() != null)
            sb.append("NumFalsePositives: ").append(getNumFalsePositives()).append(",");
        if (getNumTrueNegatives() != null)
            sb.append("NumTrueNegatives: ").append(getNumTrueNegatives()).append(",");
        if (getNumFalseNegatives() != null)
            sb.append("NumFalseNegatives: ").append(getNumFalseNegatives());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfusionMatrix == false)
            return false;
        ConfusionMatrix other = (ConfusionMatrix) obj;
        if (other.getNumTruePositives() == null ^ this.getNumTruePositives() == null)
            return false;
        if (other.getNumTruePositives() != null && other.getNumTruePositives().equals(this.getNumTruePositives()) == false)
            return false;
        if (other.getNumFalsePositives() == null ^ this.getNumFalsePositives() == null)
            return false;
        if (other.getNumFalsePositives() != null && other.getNumFalsePositives().equals(this.getNumFalsePositives()) == false)
            return false;
        if (other.getNumTrueNegatives() == null ^ this.getNumTrueNegatives() == null)
            return false;
        if (other.getNumTrueNegatives() != null && other.getNumTrueNegatives().equals(this.getNumTrueNegatives()) == false)
            return false;
        if (other.getNumFalseNegatives() == null ^ this.getNumFalseNegatives() == null)
            return false;
        if (other.getNumFalseNegatives() != null && other.getNumFalseNegatives().equals(this.getNumFalseNegatives()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumTruePositives() == null) ? 0 : getNumTruePositives().hashCode());
        hashCode = prime * hashCode + ((getNumFalsePositives() == null) ? 0 : getNumFalsePositives().hashCode());
        hashCode = prime * hashCode + ((getNumTrueNegatives() == null) ? 0 : getNumTrueNegatives().hashCode());
        hashCode = prime * hashCode + ((getNumFalseNegatives() == null) ? 0 : getNumFalseNegatives().hashCode());
        return hashCode;
    }

    @Override
    public ConfusionMatrix clone() {
        try {
            return (ConfusionMatrix) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ConfusionMatrixMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
