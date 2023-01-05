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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of additional state information, such as domain and clock configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/LiveSimulationState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LiveSimulationState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of simulation clocks.
     * </p>
     * <note>
     * <p>
     * At this time, a simulation has only one clock.
     * </p>
     * </note>
     */
    private java.util.List<SimulationClock> clocks;
    /**
     * <p>
     * A list of domains for the simulation. For more information about domains, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key concepts</a> in
     * the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * </p>
     */
    private java.util.List<Domain> domains;

    /**
     * <p>
     * A list of simulation clocks.
     * </p>
     * <note>
     * <p>
     * At this time, a simulation has only one clock.
     * </p>
     * </note>
     * 
     * @return A list of simulation clocks.</p> <note>
     *         <p>
     *         At this time, a simulation has only one clock.
     *         </p>
     */

    public java.util.List<SimulationClock> getClocks() {
        return clocks;
    }

    /**
     * <p>
     * A list of simulation clocks.
     * </p>
     * <note>
     * <p>
     * At this time, a simulation has only one clock.
     * </p>
     * </note>
     * 
     * @param clocks
     *        A list of simulation clocks.</p> <note>
     *        <p>
     *        At this time, a simulation has only one clock.
     *        </p>
     */

    public void setClocks(java.util.Collection<SimulationClock> clocks) {
        if (clocks == null) {
            this.clocks = null;
            return;
        }

        this.clocks = new java.util.ArrayList<SimulationClock>(clocks);
    }

    /**
     * <p>
     * A list of simulation clocks.
     * </p>
     * <note>
     * <p>
     * At this time, a simulation has only one clock.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClocks(java.util.Collection)} or {@link #withClocks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param clocks
     *        A list of simulation clocks.</p> <note>
     *        <p>
     *        At this time, a simulation has only one clock.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LiveSimulationState withClocks(SimulationClock... clocks) {
        if (this.clocks == null) {
            setClocks(new java.util.ArrayList<SimulationClock>(clocks.length));
        }
        for (SimulationClock ele : clocks) {
            this.clocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of simulation clocks.
     * </p>
     * <note>
     * <p>
     * At this time, a simulation has only one clock.
     * </p>
     * </note>
     * 
     * @param clocks
     *        A list of simulation clocks.</p> <note>
     *        <p>
     *        At this time, a simulation has only one clock.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LiveSimulationState withClocks(java.util.Collection<SimulationClock> clocks) {
        setClocks(clocks);
        return this;
    }

    /**
     * <p>
     * A list of domains for the simulation. For more information about domains, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key concepts</a> in
     * the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * </p>
     * 
     * @return A list of domains for the simulation. For more information about domains, see <a
     *         href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key
     *         concepts</a> in the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     */

    public java.util.List<Domain> getDomains() {
        return domains;
    }

    /**
     * <p>
     * A list of domains for the simulation. For more information about domains, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key concepts</a> in
     * the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * </p>
     * 
     * @param domains
     *        A list of domains for the simulation. For more information about domains, see <a
     *        href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key
     *        concepts</a> in the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     */

    public void setDomains(java.util.Collection<Domain> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }

        this.domains = new java.util.ArrayList<Domain>(domains);
    }

    /**
     * <p>
     * A list of domains for the simulation. For more information about domains, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key concepts</a> in
     * the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomains(java.util.Collection)} or {@link #withDomains(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param domains
     *        A list of domains for the simulation. For more information about domains, see <a
     *        href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key
     *        concepts</a> in the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LiveSimulationState withDomains(Domain... domains) {
        if (this.domains == null) {
            setDomains(new java.util.ArrayList<Domain>(domains.length));
        }
        for (Domain ele : domains) {
            this.domains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of domains for the simulation. For more information about domains, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key concepts</a> in
     * the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * </p>
     * 
     * @param domains
     *        A list of domains for the simulation. For more information about domains, see <a
     *        href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key
     *        concepts</a> in the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LiveSimulationState withDomains(java.util.Collection<Domain> domains) {
        setDomains(domains);
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
        if (getClocks() != null)
            sb.append("Clocks: ").append(getClocks()).append(",");
        if (getDomains() != null)
            sb.append("Domains: ").append(getDomains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LiveSimulationState == false)
            return false;
        LiveSimulationState other = (LiveSimulationState) obj;
        if (other.getClocks() == null ^ this.getClocks() == null)
            return false;
        if (other.getClocks() != null && other.getClocks().equals(this.getClocks()) == false)
            return false;
        if (other.getDomains() == null ^ this.getDomains() == null)
            return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClocks() == null) ? 0 : getClocks().hashCode());
        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode());
        return hashCode;
    }

    @Override
    public LiveSimulationState clone() {
        try {
            return (LiveSimulationState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.LiveSimulationStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
