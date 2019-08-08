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
 * The parameters to configure the find matches transform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/FindMatchesParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindMatchesParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a column that uniquely identifies rows in the source table. Used to help identify matching records.
     * </p>
     */
    private String primaryKeyColumnName;
    /**
     * <p>
     * The value selected when tuning your transform for a balance between precision and recall. A value of 0.5 means no
     * preference; a value of 1.0 means a bias purely for precision, and a value of 0.0 means a bias for recall. Because
     * this is a tradeoff, choosing values close to 1.0 means very low recall, and choosing values close to 0.0 results
     * in very low precision.
     * </p>
     * <p>
     * The precision metric indicates how often your model is correct when it predicts a match.
     * </p>
     * <p>
     * The recall metric indicates that for an actual match, how often your model predicts the match.
     * </p>
     */
    private Double precisionRecallTradeoff;
    /**
     * <p>
     * The value that is selected when tuning your transform for a balance between accuracy and cost. A value of 0.5
     * means that the system balances accuracy and cost concerns. A value of 1.0 means a bias purely for accuracy, which
     * typically results in a higher cost, sometimes substantially higher. A value of 0.0 means a bias purely for cost,
     * which results in a less accurate <code>FindMatches</code> transform, sometimes with unacceptable accuracy.
     * </p>
     * <p>
     * Accuracy measures how well the transform finds true positives and true negatives. Increasing accuracy requires
     * more machine resources and cost. But it also results in increased recall.
     * </p>
     * <p>
     * Cost measures how many compute resources, and thus money, are consumed to run the transform.
     * </p>
     */
    private Double accuracyCostTradeoff;
    /**
     * <p>
     * The value to switch on or off to force the output to match the provided labels from users. If the value is
     * <code>True</code>, the <code>find matches</code> transform forces the output to match the provided labels. The
     * results override the normal conflation results. If the value is <code>False</code>, the <code>find matches</code>
     * transform does not ensure all the labels provided are respected, and the results rely on the trained model.
     * </p>
     * <p>
     * Note that setting this value to true may increase the conflation execution time.
     * </p>
     */
    private Boolean enforceProvidedLabels;

    /**
     * <p>
     * The name of a column that uniquely identifies rows in the source table. Used to help identify matching records.
     * </p>
     * 
     * @param primaryKeyColumnName
     *        The name of a column that uniquely identifies rows in the source table. Used to help identify matching
     *        records.
     */

    public void setPrimaryKeyColumnName(String primaryKeyColumnName) {
        this.primaryKeyColumnName = primaryKeyColumnName;
    }

    /**
     * <p>
     * The name of a column that uniquely identifies rows in the source table. Used to help identify matching records.
     * </p>
     * 
     * @return The name of a column that uniquely identifies rows in the source table. Used to help identify matching
     *         records.
     */

    public String getPrimaryKeyColumnName() {
        return this.primaryKeyColumnName;
    }

    /**
     * <p>
     * The name of a column that uniquely identifies rows in the source table. Used to help identify matching records.
     * </p>
     * 
     * @param primaryKeyColumnName
     *        The name of a column that uniquely identifies rows in the source table. Used to help identify matching
     *        records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindMatchesParameters withPrimaryKeyColumnName(String primaryKeyColumnName) {
        setPrimaryKeyColumnName(primaryKeyColumnName);
        return this;
    }

    /**
     * <p>
     * The value selected when tuning your transform for a balance between precision and recall. A value of 0.5 means no
     * preference; a value of 1.0 means a bias purely for precision, and a value of 0.0 means a bias for recall. Because
     * this is a tradeoff, choosing values close to 1.0 means very low recall, and choosing values close to 0.0 results
     * in very low precision.
     * </p>
     * <p>
     * The precision metric indicates how often your model is correct when it predicts a match.
     * </p>
     * <p>
     * The recall metric indicates that for an actual match, how often your model predicts the match.
     * </p>
     * 
     * @param precisionRecallTradeoff
     *        The value selected when tuning your transform for a balance between precision and recall. A value of 0.5
     *        means no preference; a value of 1.0 means a bias purely for precision, and a value of 0.0 means a bias for
     *        recall. Because this is a tradeoff, choosing values close to 1.0 means very low recall, and choosing
     *        values close to 0.0 results in very low precision.</p>
     *        <p>
     *        The precision metric indicates how often your model is correct when it predicts a match.
     *        </p>
     *        <p>
     *        The recall metric indicates that for an actual match, how often your model predicts the match.
     */

    public void setPrecisionRecallTradeoff(Double precisionRecallTradeoff) {
        this.precisionRecallTradeoff = precisionRecallTradeoff;
    }

    /**
     * <p>
     * The value selected when tuning your transform for a balance between precision and recall. A value of 0.5 means no
     * preference; a value of 1.0 means a bias purely for precision, and a value of 0.0 means a bias for recall. Because
     * this is a tradeoff, choosing values close to 1.0 means very low recall, and choosing values close to 0.0 results
     * in very low precision.
     * </p>
     * <p>
     * The precision metric indicates how often your model is correct when it predicts a match.
     * </p>
     * <p>
     * The recall metric indicates that for an actual match, how often your model predicts the match.
     * </p>
     * 
     * @return The value selected when tuning your transform for a balance between precision and recall. A value of 0.5
     *         means no preference; a value of 1.0 means a bias purely for precision, and a value of 0.0 means a bias
     *         for recall. Because this is a tradeoff, choosing values close to 1.0 means very low recall, and choosing
     *         values close to 0.0 results in very low precision.</p>
     *         <p>
     *         The precision metric indicates how often your model is correct when it predicts a match.
     *         </p>
     *         <p>
     *         The recall metric indicates that for an actual match, how often your model predicts the match.
     */

    public Double getPrecisionRecallTradeoff() {
        return this.precisionRecallTradeoff;
    }

    /**
     * <p>
     * The value selected when tuning your transform for a balance between precision and recall. A value of 0.5 means no
     * preference; a value of 1.0 means a bias purely for precision, and a value of 0.0 means a bias for recall. Because
     * this is a tradeoff, choosing values close to 1.0 means very low recall, and choosing values close to 0.0 results
     * in very low precision.
     * </p>
     * <p>
     * The precision metric indicates how often your model is correct when it predicts a match.
     * </p>
     * <p>
     * The recall metric indicates that for an actual match, how often your model predicts the match.
     * </p>
     * 
     * @param precisionRecallTradeoff
     *        The value selected when tuning your transform for a balance between precision and recall. A value of 0.5
     *        means no preference; a value of 1.0 means a bias purely for precision, and a value of 0.0 means a bias for
     *        recall. Because this is a tradeoff, choosing values close to 1.0 means very low recall, and choosing
     *        values close to 0.0 results in very low precision.</p>
     *        <p>
     *        The precision metric indicates how often your model is correct when it predicts a match.
     *        </p>
     *        <p>
     *        The recall metric indicates that for an actual match, how often your model predicts the match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindMatchesParameters withPrecisionRecallTradeoff(Double precisionRecallTradeoff) {
        setPrecisionRecallTradeoff(precisionRecallTradeoff);
        return this;
    }

    /**
     * <p>
     * The value that is selected when tuning your transform for a balance between accuracy and cost. A value of 0.5
     * means that the system balances accuracy and cost concerns. A value of 1.0 means a bias purely for accuracy, which
     * typically results in a higher cost, sometimes substantially higher. A value of 0.0 means a bias purely for cost,
     * which results in a less accurate <code>FindMatches</code> transform, sometimes with unacceptable accuracy.
     * </p>
     * <p>
     * Accuracy measures how well the transform finds true positives and true negatives. Increasing accuracy requires
     * more machine resources and cost. But it also results in increased recall.
     * </p>
     * <p>
     * Cost measures how many compute resources, and thus money, are consumed to run the transform.
     * </p>
     * 
     * @param accuracyCostTradeoff
     *        The value that is selected when tuning your transform for a balance between accuracy and cost. A value of
     *        0.5 means that the system balances accuracy and cost concerns. A value of 1.0 means a bias purely for
     *        accuracy, which typically results in a higher cost, sometimes substantially higher. A value of 0.0 means a
     *        bias purely for cost, which results in a less accurate <code>FindMatches</code> transform, sometimes with
     *        unacceptable accuracy.</p>
     *        <p>
     *        Accuracy measures how well the transform finds true positives and true negatives. Increasing accuracy
     *        requires more machine resources and cost. But it also results in increased recall.
     *        </p>
     *        <p>
     *        Cost measures how many compute resources, and thus money, are consumed to run the transform.
     */

    public void setAccuracyCostTradeoff(Double accuracyCostTradeoff) {
        this.accuracyCostTradeoff = accuracyCostTradeoff;
    }

    /**
     * <p>
     * The value that is selected when tuning your transform for a balance between accuracy and cost. A value of 0.5
     * means that the system balances accuracy and cost concerns. A value of 1.0 means a bias purely for accuracy, which
     * typically results in a higher cost, sometimes substantially higher. A value of 0.0 means a bias purely for cost,
     * which results in a less accurate <code>FindMatches</code> transform, sometimes with unacceptable accuracy.
     * </p>
     * <p>
     * Accuracy measures how well the transform finds true positives and true negatives. Increasing accuracy requires
     * more machine resources and cost. But it also results in increased recall.
     * </p>
     * <p>
     * Cost measures how many compute resources, and thus money, are consumed to run the transform.
     * </p>
     * 
     * @return The value that is selected when tuning your transform for a balance between accuracy and cost. A value of
     *         0.5 means that the system balances accuracy and cost concerns. A value of 1.0 means a bias purely for
     *         accuracy, which typically results in a higher cost, sometimes substantially higher. A value of 0.0 means
     *         a bias purely for cost, which results in a less accurate <code>FindMatches</code> transform, sometimes
     *         with unacceptable accuracy.</p>
     *         <p>
     *         Accuracy measures how well the transform finds true positives and true negatives. Increasing accuracy
     *         requires more machine resources and cost. But it also results in increased recall.
     *         </p>
     *         <p>
     *         Cost measures how many compute resources, and thus money, are consumed to run the transform.
     */

    public Double getAccuracyCostTradeoff() {
        return this.accuracyCostTradeoff;
    }

    /**
     * <p>
     * The value that is selected when tuning your transform for a balance between accuracy and cost. A value of 0.5
     * means that the system balances accuracy and cost concerns. A value of 1.0 means a bias purely for accuracy, which
     * typically results in a higher cost, sometimes substantially higher. A value of 0.0 means a bias purely for cost,
     * which results in a less accurate <code>FindMatches</code> transform, sometimes with unacceptable accuracy.
     * </p>
     * <p>
     * Accuracy measures how well the transform finds true positives and true negatives. Increasing accuracy requires
     * more machine resources and cost. But it also results in increased recall.
     * </p>
     * <p>
     * Cost measures how many compute resources, and thus money, are consumed to run the transform.
     * </p>
     * 
     * @param accuracyCostTradeoff
     *        The value that is selected when tuning your transform for a balance between accuracy and cost. A value of
     *        0.5 means that the system balances accuracy and cost concerns. A value of 1.0 means a bias purely for
     *        accuracy, which typically results in a higher cost, sometimes substantially higher. A value of 0.0 means a
     *        bias purely for cost, which results in a less accurate <code>FindMatches</code> transform, sometimes with
     *        unacceptable accuracy.</p>
     *        <p>
     *        Accuracy measures how well the transform finds true positives and true negatives. Increasing accuracy
     *        requires more machine resources and cost. But it also results in increased recall.
     *        </p>
     *        <p>
     *        Cost measures how many compute resources, and thus money, are consumed to run the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindMatchesParameters withAccuracyCostTradeoff(Double accuracyCostTradeoff) {
        setAccuracyCostTradeoff(accuracyCostTradeoff);
        return this;
    }

    /**
     * <p>
     * The value to switch on or off to force the output to match the provided labels from users. If the value is
     * <code>True</code>, the <code>find matches</code> transform forces the output to match the provided labels. The
     * results override the normal conflation results. If the value is <code>False</code>, the <code>find matches</code>
     * transform does not ensure all the labels provided are respected, and the results rely on the trained model.
     * </p>
     * <p>
     * Note that setting this value to true may increase the conflation execution time.
     * </p>
     * 
     * @param enforceProvidedLabels
     *        The value to switch on or off to force the output to match the provided labels from users. If the value is
     *        <code>True</code>, the <code>find matches</code> transform forces the output to match the provided labels.
     *        The results override the normal conflation results. If the value is <code>False</code>, the
     *        <code>find matches</code> transform does not ensure all the labels provided are respected, and the results
     *        rely on the trained model.</p>
     *        <p>
     *        Note that setting this value to true may increase the conflation execution time.
     */

    public void setEnforceProvidedLabels(Boolean enforceProvidedLabels) {
        this.enforceProvidedLabels = enforceProvidedLabels;
    }

    /**
     * <p>
     * The value to switch on or off to force the output to match the provided labels from users. If the value is
     * <code>True</code>, the <code>find matches</code> transform forces the output to match the provided labels. The
     * results override the normal conflation results. If the value is <code>False</code>, the <code>find matches</code>
     * transform does not ensure all the labels provided are respected, and the results rely on the trained model.
     * </p>
     * <p>
     * Note that setting this value to true may increase the conflation execution time.
     * </p>
     * 
     * @return The value to switch on or off to force the output to match the provided labels from users. If the value
     *         is <code>True</code>, the <code>find matches</code> transform forces the output to match the provided
     *         labels. The results override the normal conflation results. If the value is <code>False</code>, the
     *         <code>find matches</code> transform does not ensure all the labels provided are respected, and the
     *         results rely on the trained model.</p>
     *         <p>
     *         Note that setting this value to true may increase the conflation execution time.
     */

    public Boolean getEnforceProvidedLabels() {
        return this.enforceProvidedLabels;
    }

    /**
     * <p>
     * The value to switch on or off to force the output to match the provided labels from users. If the value is
     * <code>True</code>, the <code>find matches</code> transform forces the output to match the provided labels. The
     * results override the normal conflation results. If the value is <code>False</code>, the <code>find matches</code>
     * transform does not ensure all the labels provided are respected, and the results rely on the trained model.
     * </p>
     * <p>
     * Note that setting this value to true may increase the conflation execution time.
     * </p>
     * 
     * @param enforceProvidedLabels
     *        The value to switch on or off to force the output to match the provided labels from users. If the value is
     *        <code>True</code>, the <code>find matches</code> transform forces the output to match the provided labels.
     *        The results override the normal conflation results. If the value is <code>False</code>, the
     *        <code>find matches</code> transform does not ensure all the labels provided are respected, and the results
     *        rely on the trained model.</p>
     *        <p>
     *        Note that setting this value to true may increase the conflation execution time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindMatchesParameters withEnforceProvidedLabels(Boolean enforceProvidedLabels) {
        setEnforceProvidedLabels(enforceProvidedLabels);
        return this;
    }

    /**
     * <p>
     * The value to switch on or off to force the output to match the provided labels from users. If the value is
     * <code>True</code>, the <code>find matches</code> transform forces the output to match the provided labels. The
     * results override the normal conflation results. If the value is <code>False</code>, the <code>find matches</code>
     * transform does not ensure all the labels provided are respected, and the results rely on the trained model.
     * </p>
     * <p>
     * Note that setting this value to true may increase the conflation execution time.
     * </p>
     * 
     * @return The value to switch on or off to force the output to match the provided labels from users. If the value
     *         is <code>True</code>, the <code>find matches</code> transform forces the output to match the provided
     *         labels. The results override the normal conflation results. If the value is <code>False</code>, the
     *         <code>find matches</code> transform does not ensure all the labels provided are respected, and the
     *         results rely on the trained model.</p>
     *         <p>
     *         Note that setting this value to true may increase the conflation execution time.
     */

    public Boolean isEnforceProvidedLabels() {
        return this.enforceProvidedLabels;
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
        if (getPrimaryKeyColumnName() != null)
            sb.append("PrimaryKeyColumnName: ").append(getPrimaryKeyColumnName()).append(",");
        if (getPrecisionRecallTradeoff() != null)
            sb.append("PrecisionRecallTradeoff: ").append(getPrecisionRecallTradeoff()).append(",");
        if (getAccuracyCostTradeoff() != null)
            sb.append("AccuracyCostTradeoff: ").append(getAccuracyCostTradeoff()).append(",");
        if (getEnforceProvidedLabels() != null)
            sb.append("EnforceProvidedLabels: ").append(getEnforceProvidedLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindMatchesParameters == false)
            return false;
        FindMatchesParameters other = (FindMatchesParameters) obj;
        if (other.getPrimaryKeyColumnName() == null ^ this.getPrimaryKeyColumnName() == null)
            return false;
        if (other.getPrimaryKeyColumnName() != null && other.getPrimaryKeyColumnName().equals(this.getPrimaryKeyColumnName()) == false)
            return false;
        if (other.getPrecisionRecallTradeoff() == null ^ this.getPrecisionRecallTradeoff() == null)
            return false;
        if (other.getPrecisionRecallTradeoff() != null && other.getPrecisionRecallTradeoff().equals(this.getPrecisionRecallTradeoff()) == false)
            return false;
        if (other.getAccuracyCostTradeoff() == null ^ this.getAccuracyCostTradeoff() == null)
            return false;
        if (other.getAccuracyCostTradeoff() != null && other.getAccuracyCostTradeoff().equals(this.getAccuracyCostTradeoff()) == false)
            return false;
        if (other.getEnforceProvidedLabels() == null ^ this.getEnforceProvidedLabels() == null)
            return false;
        if (other.getEnforceProvidedLabels() != null && other.getEnforceProvidedLabels().equals(this.getEnforceProvidedLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryKeyColumnName() == null) ? 0 : getPrimaryKeyColumnName().hashCode());
        hashCode = prime * hashCode + ((getPrecisionRecallTradeoff() == null) ? 0 : getPrecisionRecallTradeoff().hashCode());
        hashCode = prime * hashCode + ((getAccuracyCostTradeoff() == null) ? 0 : getAccuracyCostTradeoff().hashCode());
        hashCode = prime * hashCode + ((getEnforceProvidedLabels() == null) ? 0 : getEnforceProvidedLabels().hashCode());
        return hashCode;
    }

    @Override
    public FindMatchesParameters clone() {
        try {
            return (FindMatchesParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.FindMatchesParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
