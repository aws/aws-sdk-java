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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information for manually tuning the relevance of a field in a search. When a query includes terms that match
 * the field, the results are given a boost in the response based on these tuning parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Relevance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Relevance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates that this field determines how "fresh" a document is. For example, if document 1 was created on
     * November 5, and document 2 was created on October 31, document 1 is "fresher" than document 2. You can only set
     * the <code>Freshness</code> field on one <code>DATE</code> type field. Only applies to <code>DATE</code> fields.
     * </p>
     */
    private Boolean freshness;
    /**
     * <p>
     * The relative importance of the field in the search. Larger numbers provide more of a boost than smaller numbers.
     * </p>
     */
    private Integer importance;
    /**
     * <p>
     * Specifies the time period that the boost applies to. For example, to make the boost apply to documents with the
     * field value within the last month, you would use "2628000s". Once the field value is beyond the specified range,
     * the effect of the boost drops off. The higher the importance, the faster the effect drops off. If you don't
     * specify a value, the default is 3 months. The value of the field is a numeric string followed by the character
     * "s", for example "86400s" for one day, or "604800s" for one week.
     * </p>
     * <p>
     * Only applies to <code>DATE</code> fields.
     * </p>
     */
    private String duration;
    /**
     * <p>
     * Determines how values should be interpreted.
     * </p>
     * <p>
     * When the <code>RankOrder</code> field is <code>ASCENDING</code>, higher numbers are better. For example, a
     * document with a rating score of 10 is higher ranking than a document with a rating score of 1.
     * </p>
     * <p>
     * When the <code>RankOrder</code> field is <code>DESCENDING</code>, lower numbers are better. For example, in a
     * task tracking application, a priority 1 task is more important than a priority 5 task.
     * </p>
     * <p>
     * Only applies to <code>LONG</code> and <code>DOUBLE</code> fields.
     * </p>
     */
    private String rankOrder;
    /**
     * <p>
     * A list of values that should be given a different boost when they appear in the result list. For example, if you
     * are boosting a field called "department," query terms that match the department field are boosted in the result.
     * However, you can add entries from the department field to boost documents with those values higher.
     * </p>
     * <p>
     * For example, you can add entries to the map with names of departments. If you add "HR",5 and "Legal",3 those
     * departments are given special attention when they appear in the metadata of a document. When those terms appear
     * they are given the specified importance instead of the regular importance for the boost.
     * </p>
     */
    private java.util.Map<String, Integer> valueImportanceMap;

    /**
     * <p>
     * Indicates that this field determines how "fresh" a document is. For example, if document 1 was created on
     * November 5, and document 2 was created on October 31, document 1 is "fresher" than document 2. You can only set
     * the <code>Freshness</code> field on one <code>DATE</code> type field. Only applies to <code>DATE</code> fields.
     * </p>
     * 
     * @param freshness
     *        Indicates that this field determines how "fresh" a document is. For example, if document 1 was created on
     *        November 5, and document 2 was created on October 31, document 1 is "fresher" than document 2. You can
     *        only set the <code>Freshness</code> field on one <code>DATE</code> type field. Only applies to
     *        <code>DATE</code> fields.
     */

    public void setFreshness(Boolean freshness) {
        this.freshness = freshness;
    }

    /**
     * <p>
     * Indicates that this field determines how "fresh" a document is. For example, if document 1 was created on
     * November 5, and document 2 was created on October 31, document 1 is "fresher" than document 2. You can only set
     * the <code>Freshness</code> field on one <code>DATE</code> type field. Only applies to <code>DATE</code> fields.
     * </p>
     * 
     * @return Indicates that this field determines how "fresh" a document is. For example, if document 1 was created on
     *         November 5, and document 2 was created on October 31, document 1 is "fresher" than document 2. You can
     *         only set the <code>Freshness</code> field on one <code>DATE</code> type field. Only applies to
     *         <code>DATE</code> fields.
     */

    public Boolean getFreshness() {
        return this.freshness;
    }

    /**
     * <p>
     * Indicates that this field determines how "fresh" a document is. For example, if document 1 was created on
     * November 5, and document 2 was created on October 31, document 1 is "fresher" than document 2. You can only set
     * the <code>Freshness</code> field on one <code>DATE</code> type field. Only applies to <code>DATE</code> fields.
     * </p>
     * 
     * @param freshness
     *        Indicates that this field determines how "fresh" a document is. For example, if document 1 was created on
     *        November 5, and document 2 was created on October 31, document 1 is "fresher" than document 2. You can
     *        only set the <code>Freshness</code> field on one <code>DATE</code> type field. Only applies to
     *        <code>DATE</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relevance withFreshness(Boolean freshness) {
        setFreshness(freshness);
        return this;
    }

    /**
     * <p>
     * Indicates that this field determines how "fresh" a document is. For example, if document 1 was created on
     * November 5, and document 2 was created on October 31, document 1 is "fresher" than document 2. You can only set
     * the <code>Freshness</code> field on one <code>DATE</code> type field. Only applies to <code>DATE</code> fields.
     * </p>
     * 
     * @return Indicates that this field determines how "fresh" a document is. For example, if document 1 was created on
     *         November 5, and document 2 was created on October 31, document 1 is "fresher" than document 2. You can
     *         only set the <code>Freshness</code> field on one <code>DATE</code> type field. Only applies to
     *         <code>DATE</code> fields.
     */

    public Boolean isFreshness() {
        return this.freshness;
    }

    /**
     * <p>
     * The relative importance of the field in the search. Larger numbers provide more of a boost than smaller numbers.
     * </p>
     * 
     * @param importance
     *        The relative importance of the field in the search. Larger numbers provide more of a boost than smaller
     *        numbers.
     */

    public void setImportance(Integer importance) {
        this.importance = importance;
    }

    /**
     * <p>
     * The relative importance of the field in the search. Larger numbers provide more of a boost than smaller numbers.
     * </p>
     * 
     * @return The relative importance of the field in the search. Larger numbers provide more of a boost than smaller
     *         numbers.
     */

    public Integer getImportance() {
        return this.importance;
    }

    /**
     * <p>
     * The relative importance of the field in the search. Larger numbers provide more of a boost than smaller numbers.
     * </p>
     * 
     * @param importance
     *        The relative importance of the field in the search. Larger numbers provide more of a boost than smaller
     *        numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relevance withImportance(Integer importance) {
        setImportance(importance);
        return this;
    }

    /**
     * <p>
     * Specifies the time period that the boost applies to. For example, to make the boost apply to documents with the
     * field value within the last month, you would use "2628000s". Once the field value is beyond the specified range,
     * the effect of the boost drops off. The higher the importance, the faster the effect drops off. If you don't
     * specify a value, the default is 3 months. The value of the field is a numeric string followed by the character
     * "s", for example "86400s" for one day, or "604800s" for one week.
     * </p>
     * <p>
     * Only applies to <code>DATE</code> fields.
     * </p>
     * 
     * @param duration
     *        Specifies the time period that the boost applies to. For example, to make the boost apply to documents
     *        with the field value within the last month, you would use "2628000s". Once the field value is beyond the
     *        specified range, the effect of the boost drops off. The higher the importance, the faster the effect drops
     *        off. If you don't specify a value, the default is 3 months. The value of the field is a numeric string
     *        followed by the character "s", for example "86400s" for one day, or "604800s" for one week. </p>
     *        <p>
     *        Only applies to <code>DATE</code> fields.
     */

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * Specifies the time period that the boost applies to. For example, to make the boost apply to documents with the
     * field value within the last month, you would use "2628000s". Once the field value is beyond the specified range,
     * the effect of the boost drops off. The higher the importance, the faster the effect drops off. If you don't
     * specify a value, the default is 3 months. The value of the field is a numeric string followed by the character
     * "s", for example "86400s" for one day, or "604800s" for one week.
     * </p>
     * <p>
     * Only applies to <code>DATE</code> fields.
     * </p>
     * 
     * @return Specifies the time period that the boost applies to. For example, to make the boost apply to documents
     *         with the field value within the last month, you would use "2628000s". Once the field value is beyond the
     *         specified range, the effect of the boost drops off. The higher the importance, the faster the effect
     *         drops off. If you don't specify a value, the default is 3 months. The value of the field is a numeric
     *         string followed by the character "s", for example "86400s" for one day, or "604800s" for one week. </p>
     *         <p>
     *         Only applies to <code>DATE</code> fields.
     */

    public String getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * Specifies the time period that the boost applies to. For example, to make the boost apply to documents with the
     * field value within the last month, you would use "2628000s". Once the field value is beyond the specified range,
     * the effect of the boost drops off. The higher the importance, the faster the effect drops off. If you don't
     * specify a value, the default is 3 months. The value of the field is a numeric string followed by the character
     * "s", for example "86400s" for one day, or "604800s" for one week.
     * </p>
     * <p>
     * Only applies to <code>DATE</code> fields.
     * </p>
     * 
     * @param duration
     *        Specifies the time period that the boost applies to. For example, to make the boost apply to documents
     *        with the field value within the last month, you would use "2628000s". Once the field value is beyond the
     *        specified range, the effect of the boost drops off. The higher the importance, the faster the effect drops
     *        off. If you don't specify a value, the default is 3 months. The value of the field is a numeric string
     *        followed by the character "s", for example "86400s" for one day, or "604800s" for one week. </p>
     *        <p>
     *        Only applies to <code>DATE</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relevance withDuration(String duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * Determines how values should be interpreted.
     * </p>
     * <p>
     * When the <code>RankOrder</code> field is <code>ASCENDING</code>, higher numbers are better. For example, a
     * document with a rating score of 10 is higher ranking than a document with a rating score of 1.
     * </p>
     * <p>
     * When the <code>RankOrder</code> field is <code>DESCENDING</code>, lower numbers are better. For example, in a
     * task tracking application, a priority 1 task is more important than a priority 5 task.
     * </p>
     * <p>
     * Only applies to <code>LONG</code> and <code>DOUBLE</code> fields.
     * </p>
     * 
     * @param rankOrder
     *        Determines how values should be interpreted.</p>
     *        <p>
     *        When the <code>RankOrder</code> field is <code>ASCENDING</code>, higher numbers are better. For example, a
     *        document with a rating score of 10 is higher ranking than a document with a rating score of 1.
     *        </p>
     *        <p>
     *        When the <code>RankOrder</code> field is <code>DESCENDING</code>, lower numbers are better. For example,
     *        in a task tracking application, a priority 1 task is more important than a priority 5 task.
     *        </p>
     *        <p>
     *        Only applies to <code>LONG</code> and <code>DOUBLE</code> fields.
     * @see Order
     */

    public void setRankOrder(String rankOrder) {
        this.rankOrder = rankOrder;
    }

    /**
     * <p>
     * Determines how values should be interpreted.
     * </p>
     * <p>
     * When the <code>RankOrder</code> field is <code>ASCENDING</code>, higher numbers are better. For example, a
     * document with a rating score of 10 is higher ranking than a document with a rating score of 1.
     * </p>
     * <p>
     * When the <code>RankOrder</code> field is <code>DESCENDING</code>, lower numbers are better. For example, in a
     * task tracking application, a priority 1 task is more important than a priority 5 task.
     * </p>
     * <p>
     * Only applies to <code>LONG</code> and <code>DOUBLE</code> fields.
     * </p>
     * 
     * @return Determines how values should be interpreted.</p>
     *         <p>
     *         When the <code>RankOrder</code> field is <code>ASCENDING</code>, higher numbers are better. For example,
     *         a document with a rating score of 10 is higher ranking than a document with a rating score of 1.
     *         </p>
     *         <p>
     *         When the <code>RankOrder</code> field is <code>DESCENDING</code>, lower numbers are better. For example,
     *         in a task tracking application, a priority 1 task is more important than a priority 5 task.
     *         </p>
     *         <p>
     *         Only applies to <code>LONG</code> and <code>DOUBLE</code> fields.
     * @see Order
     */

    public String getRankOrder() {
        return this.rankOrder;
    }

    /**
     * <p>
     * Determines how values should be interpreted.
     * </p>
     * <p>
     * When the <code>RankOrder</code> field is <code>ASCENDING</code>, higher numbers are better. For example, a
     * document with a rating score of 10 is higher ranking than a document with a rating score of 1.
     * </p>
     * <p>
     * When the <code>RankOrder</code> field is <code>DESCENDING</code>, lower numbers are better. For example, in a
     * task tracking application, a priority 1 task is more important than a priority 5 task.
     * </p>
     * <p>
     * Only applies to <code>LONG</code> and <code>DOUBLE</code> fields.
     * </p>
     * 
     * @param rankOrder
     *        Determines how values should be interpreted.</p>
     *        <p>
     *        When the <code>RankOrder</code> field is <code>ASCENDING</code>, higher numbers are better. For example, a
     *        document with a rating score of 10 is higher ranking than a document with a rating score of 1.
     *        </p>
     *        <p>
     *        When the <code>RankOrder</code> field is <code>DESCENDING</code>, lower numbers are better. For example,
     *        in a task tracking application, a priority 1 task is more important than a priority 5 task.
     *        </p>
     *        <p>
     *        Only applies to <code>LONG</code> and <code>DOUBLE</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public Relevance withRankOrder(String rankOrder) {
        setRankOrder(rankOrder);
        return this;
    }

    /**
     * <p>
     * Determines how values should be interpreted.
     * </p>
     * <p>
     * When the <code>RankOrder</code> field is <code>ASCENDING</code>, higher numbers are better. For example, a
     * document with a rating score of 10 is higher ranking than a document with a rating score of 1.
     * </p>
     * <p>
     * When the <code>RankOrder</code> field is <code>DESCENDING</code>, lower numbers are better. For example, in a
     * task tracking application, a priority 1 task is more important than a priority 5 task.
     * </p>
     * <p>
     * Only applies to <code>LONG</code> and <code>DOUBLE</code> fields.
     * </p>
     * 
     * @param rankOrder
     *        Determines how values should be interpreted.</p>
     *        <p>
     *        When the <code>RankOrder</code> field is <code>ASCENDING</code>, higher numbers are better. For example, a
     *        document with a rating score of 10 is higher ranking than a document with a rating score of 1.
     *        </p>
     *        <p>
     *        When the <code>RankOrder</code> field is <code>DESCENDING</code>, lower numbers are better. For example,
     *        in a task tracking application, a priority 1 task is more important than a priority 5 task.
     *        </p>
     *        <p>
     *        Only applies to <code>LONG</code> and <code>DOUBLE</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public Relevance withRankOrder(Order rankOrder) {
        this.rankOrder = rankOrder.toString();
        return this;
    }

    /**
     * <p>
     * A list of values that should be given a different boost when they appear in the result list. For example, if you
     * are boosting a field called "department," query terms that match the department field are boosted in the result.
     * However, you can add entries from the department field to boost documents with those values higher.
     * </p>
     * <p>
     * For example, you can add entries to the map with names of departments. If you add "HR",5 and "Legal",3 those
     * departments are given special attention when they appear in the metadata of a document. When those terms appear
     * they are given the specified importance instead of the regular importance for the boost.
     * </p>
     * 
     * @return A list of values that should be given a different boost when they appear in the result list. For example,
     *         if you are boosting a field called "department," query terms that match the department field are boosted
     *         in the result. However, you can add entries from the department field to boost documents with those
     *         values higher. </p>
     *         <p>
     *         For example, you can add entries to the map with names of departments. If you add "HR",5 and "Legal",3
     *         those departments are given special attention when they appear in the metadata of a document. When those
     *         terms appear they are given the specified importance instead of the regular importance for the boost.
     */

    public java.util.Map<String, Integer> getValueImportanceMap() {
        return valueImportanceMap;
    }

    /**
     * <p>
     * A list of values that should be given a different boost when they appear in the result list. For example, if you
     * are boosting a field called "department," query terms that match the department field are boosted in the result.
     * However, you can add entries from the department field to boost documents with those values higher.
     * </p>
     * <p>
     * For example, you can add entries to the map with names of departments. If you add "HR",5 and "Legal",3 those
     * departments are given special attention when they appear in the metadata of a document. When those terms appear
     * they are given the specified importance instead of the regular importance for the boost.
     * </p>
     * 
     * @param valueImportanceMap
     *        A list of values that should be given a different boost when they appear in the result list. For example,
     *        if you are boosting a field called "department," query terms that match the department field are boosted
     *        in the result. However, you can add entries from the department field to boost documents with those values
     *        higher. </p>
     *        <p>
     *        For example, you can add entries to the map with names of departments. If you add "HR",5 and "Legal",3
     *        those departments are given special attention when they appear in the metadata of a document. When those
     *        terms appear they are given the specified importance instead of the regular importance for the boost.
     */

    public void setValueImportanceMap(java.util.Map<String, Integer> valueImportanceMap) {
        this.valueImportanceMap = valueImportanceMap;
    }

    /**
     * <p>
     * A list of values that should be given a different boost when they appear in the result list. For example, if you
     * are boosting a field called "department," query terms that match the department field are boosted in the result.
     * However, you can add entries from the department field to boost documents with those values higher.
     * </p>
     * <p>
     * For example, you can add entries to the map with names of departments. If you add "HR",5 and "Legal",3 those
     * departments are given special attention when they appear in the metadata of a document. When those terms appear
     * they are given the specified importance instead of the regular importance for the boost.
     * </p>
     * 
     * @param valueImportanceMap
     *        A list of values that should be given a different boost when they appear in the result list. For example,
     *        if you are boosting a field called "department," query terms that match the department field are boosted
     *        in the result. However, you can add entries from the department field to boost documents with those values
     *        higher. </p>
     *        <p>
     *        For example, you can add entries to the map with names of departments. If you add "HR",5 and "Legal",3
     *        those departments are given special attention when they appear in the metadata of a document. When those
     *        terms appear they are given the specified importance instead of the regular importance for the boost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relevance withValueImportanceMap(java.util.Map<String, Integer> valueImportanceMap) {
        setValueImportanceMap(valueImportanceMap);
        return this;
    }

    /**
     * Add a single ValueImportanceMap entry
     *
     * @see Relevance#withValueImportanceMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Relevance addValueImportanceMapEntry(String key, Integer value) {
        if (null == this.valueImportanceMap) {
            this.valueImportanceMap = new java.util.HashMap<String, Integer>();
        }
        if (this.valueImportanceMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.valueImportanceMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ValueImportanceMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relevance clearValueImportanceMapEntries() {
        this.valueImportanceMap = null;
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
        if (getFreshness() != null)
            sb.append("Freshness: ").append(getFreshness()).append(",");
        if (getImportance() != null)
            sb.append("Importance: ").append(getImportance()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getRankOrder() != null)
            sb.append("RankOrder: ").append(getRankOrder()).append(",");
        if (getValueImportanceMap() != null)
            sb.append("ValueImportanceMap: ").append(getValueImportanceMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Relevance == false)
            return false;
        Relevance other = (Relevance) obj;
        if (other.getFreshness() == null ^ this.getFreshness() == null)
            return false;
        if (other.getFreshness() != null && other.getFreshness().equals(this.getFreshness()) == false)
            return false;
        if (other.getImportance() == null ^ this.getImportance() == null)
            return false;
        if (other.getImportance() != null && other.getImportance().equals(this.getImportance()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getRankOrder() == null ^ this.getRankOrder() == null)
            return false;
        if (other.getRankOrder() != null && other.getRankOrder().equals(this.getRankOrder()) == false)
            return false;
        if (other.getValueImportanceMap() == null ^ this.getValueImportanceMap() == null)
            return false;
        if (other.getValueImportanceMap() != null && other.getValueImportanceMap().equals(this.getValueImportanceMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFreshness() == null) ? 0 : getFreshness().hashCode());
        hashCode = prime * hashCode + ((getImportance() == null) ? 0 : getImportance().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getRankOrder() == null) ? 0 : getRankOrder().hashCode());
        hashCode = prime * hashCode + ((getValueImportanceMap() == null) ? 0 : getValueImportanceMap().hashCode());
        return hashCode;
    }

    @Override
    public Relevance clone() {
        try {
            return (Relevance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.RelevanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
