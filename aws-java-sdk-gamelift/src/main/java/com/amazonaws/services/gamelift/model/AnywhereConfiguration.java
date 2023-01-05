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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * GameLift Anywhere configuration options for your Anywhere fleets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/AnywhereConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnywhereConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cost to run your fleet per hour. GameLift uses the provided cost of your fleet to balance usage in queues.
     * For more information about queues, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html">Setting up queues</a>.
     * </p>
     */
    private String cost;

    /**
     * <p>
     * The cost to run your fleet per hour. GameLift uses the provided cost of your fleet to balance usage in queues.
     * For more information about queues, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html">Setting up queues</a>.
     * </p>
     * 
     * @param cost
     *        The cost to run your fleet per hour. GameLift uses the provided cost of your fleet to balance usage in
     *        queues. For more information about queues, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html">Setting up queues</a>.
     */

    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     * <p>
     * The cost to run your fleet per hour. GameLift uses the provided cost of your fleet to balance usage in queues.
     * For more information about queues, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html">Setting up queues</a>.
     * </p>
     * 
     * @return The cost to run your fleet per hour. GameLift uses the provided cost of your fleet to balance usage in
     *         queues. For more information about queues, see <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html">Setting up
     *         queues</a>.
     */

    public String getCost() {
        return this.cost;
    }

    /**
     * <p>
     * The cost to run your fleet per hour. GameLift uses the provided cost of your fleet to balance usage in queues.
     * For more information about queues, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html">Setting up queues</a>.
     * </p>
     * 
     * @param cost
     *        The cost to run your fleet per hour. GameLift uses the provided cost of your fleet to balance usage in
     *        queues. For more information about queues, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html">Setting up queues</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnywhereConfiguration withCost(String cost) {
        setCost(cost);
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
        if (getCost() != null)
            sb.append("Cost: ").append(getCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnywhereConfiguration == false)
            return false;
        AnywhereConfiguration other = (AnywhereConfiguration) obj;
        if (other.getCost() == null ^ this.getCost() == null)
            return false;
        if (other.getCost() != null && other.getCost().equals(this.getCost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCost() == null) ? 0 : getCost().hashCode());
        return hashCode;
    }

    @Override
    public AnywhereConfiguration clone() {
        try {
            return (AnywhereConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.AnywhereConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
