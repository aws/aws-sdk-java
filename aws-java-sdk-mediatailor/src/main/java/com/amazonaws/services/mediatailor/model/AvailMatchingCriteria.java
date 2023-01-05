/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * MediaTailor only places (consumes) prefetched ads if the ad break meets the criteria defined by the dynamic
 * variables. This gives you granular control over which ad break to place the prefetched ads into.
 * </p>
 * <p>
 * As an example, let's say that you set <code>DynamicVariable</code> to <code>scte.event_id</code> and
 * <code>Operator</code> to <code>EQUALS</code>, and your playback configuration has an ADS URL of
 * <code>https://my.ads.server.com/path?&amp;podId=[scte.avail_num]&amp;event=[scte.event_id]&amp;duration=[session.avail_duration_secs]</code>
 * . And the prefetch request to the ADS contains these values
 * <code>https://my.ads.server.com/path?&amp;podId=3&amp;event=my-awesome-event&amp;duration=30</code>. MediaTailor will
 * only insert the prefetched ads into the ad break if has a SCTE marker with an event id of
 * <code>my-awesome-event</code>, since it must match the event id that MediaTailor uses to query the ADS.
 * </p>
 * <p>
 * You can specify up to five <code>AvailMatchingCriteria</code>. If you specify multiple
 * <code>AvailMatchingCriteria</code>, MediaTailor combines them to match using a logical <code>AND</code>. You can
 * model logical <code>OR</code> combinations by creating multiple prefetch schedules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/AvailMatchingCriteria" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailMatchingCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dynamic variable(s) that MediaTailor should use as avail matching criteria. MediaTailor only places the
     * prefetched ads into the avail if the avail matches the criteria defined by the dynamic variable. For information
     * about dynamic variables, see <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">Using
     * dynamic ad variables</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * <p>
     * You can include up to 100 dynamic variables.
     * </p>
     */
    private String dynamicVariable;
    /**
     * <p>
     * For the <code>DynamicVariable</code> specified in <code>AvailMatchingCriteria</code>, the Operator that is used
     * for the comparison.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The dynamic variable(s) that MediaTailor should use as avail matching criteria. MediaTailor only places the
     * prefetched ads into the avail if the avail matches the criteria defined by the dynamic variable. For information
     * about dynamic variables, see <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">Using
     * dynamic ad variables</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * <p>
     * You can include up to 100 dynamic variables.
     * </p>
     * 
     * @param dynamicVariable
     *        The dynamic variable(s) that MediaTailor should use as avail matching criteria. MediaTailor only places
     *        the prefetched ads into the avail if the avail matches the criteria defined by the dynamic variable. For
     *        information about dynamic variables, see <a
     *        href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">Using dynamic ad variables</a> in
     *        the <i>MediaTailor User Guide</i>.</p>
     *        <p>
     *        You can include up to 100 dynamic variables.
     */

    public void setDynamicVariable(String dynamicVariable) {
        this.dynamicVariable = dynamicVariable;
    }

    /**
     * <p>
     * The dynamic variable(s) that MediaTailor should use as avail matching criteria. MediaTailor only places the
     * prefetched ads into the avail if the avail matches the criteria defined by the dynamic variable. For information
     * about dynamic variables, see <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">Using
     * dynamic ad variables</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * <p>
     * You can include up to 100 dynamic variables.
     * </p>
     * 
     * @return The dynamic variable(s) that MediaTailor should use as avail matching criteria. MediaTailor only places
     *         the prefetched ads into the avail if the avail matches the criteria defined by the dynamic variable. For
     *         information about dynamic variables, see <a
     *         href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">Using dynamic ad variables</a> in
     *         the <i>MediaTailor User Guide</i>.</p>
     *         <p>
     *         You can include up to 100 dynamic variables.
     */

    public String getDynamicVariable() {
        return this.dynamicVariable;
    }

    /**
     * <p>
     * The dynamic variable(s) that MediaTailor should use as avail matching criteria. MediaTailor only places the
     * prefetched ads into the avail if the avail matches the criteria defined by the dynamic variable. For information
     * about dynamic variables, see <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">Using
     * dynamic ad variables</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * <p>
     * You can include up to 100 dynamic variables.
     * </p>
     * 
     * @param dynamicVariable
     *        The dynamic variable(s) that MediaTailor should use as avail matching criteria. MediaTailor only places
     *        the prefetched ads into the avail if the avail matches the criteria defined by the dynamic variable. For
     *        information about dynamic variables, see <a
     *        href="https://docs.aws.amazon.com/mediatailor/latest/ug/variables.html">Using dynamic ad variables</a> in
     *        the <i>MediaTailor User Guide</i>.</p>
     *        <p>
     *        You can include up to 100 dynamic variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailMatchingCriteria withDynamicVariable(String dynamicVariable) {
        setDynamicVariable(dynamicVariable);
        return this;
    }

    /**
     * <p>
     * For the <code>DynamicVariable</code> specified in <code>AvailMatchingCriteria</code>, the Operator that is used
     * for the comparison.
     * </p>
     * 
     * @param operator
     *        For the <code>DynamicVariable</code> specified in <code>AvailMatchingCriteria</code>, the Operator that is
     *        used for the comparison.
     * @see Operator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * For the <code>DynamicVariable</code> specified in <code>AvailMatchingCriteria</code>, the Operator that is used
     * for the comparison.
     * </p>
     * 
     * @return For the <code>DynamicVariable</code> specified in <code>AvailMatchingCriteria</code>, the Operator that
     *         is used for the comparison.
     * @see Operator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * For the <code>DynamicVariable</code> specified in <code>AvailMatchingCriteria</code>, the Operator that is used
     * for the comparison.
     * </p>
     * 
     * @param operator
     *        For the <code>DynamicVariable</code> specified in <code>AvailMatchingCriteria</code>, the Operator that is
     *        used for the comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public AvailMatchingCriteria withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * For the <code>DynamicVariable</code> specified in <code>AvailMatchingCriteria</code>, the Operator that is used
     * for the comparison.
     * </p>
     * 
     * @param operator
     *        For the <code>DynamicVariable</code> specified in <code>AvailMatchingCriteria</code>, the Operator that is
     *        used for the comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public AvailMatchingCriteria withOperator(Operator operator) {
        this.operator = operator.toString();
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
        if (getDynamicVariable() != null)
            sb.append("DynamicVariable: ").append(getDynamicVariable()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailMatchingCriteria == false)
            return false;
        AvailMatchingCriteria other = (AvailMatchingCriteria) obj;
        if (other.getDynamicVariable() == null ^ this.getDynamicVariable() == null)
            return false;
        if (other.getDynamicVariable() != null && other.getDynamicVariable().equals(this.getDynamicVariable()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDynamicVariable() == null) ? 0 : getDynamicVariable().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public AvailMatchingCriteria clone() {
        try {
            return (AvailMatchingCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.AvailMatchingCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
