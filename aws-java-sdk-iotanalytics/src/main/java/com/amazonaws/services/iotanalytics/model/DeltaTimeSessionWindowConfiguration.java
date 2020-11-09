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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration information of a delta time session window.
 * </p>
 * <p>
 * <a href="https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_DeltaTime.html"> <code>DeltaTime</code>
 * </a> specifies a time interval. You can use <code>DeltaTime</code> to create dataset contents with data that has
 * arrived in the data store since the last execution. For an example of <code>DeltaTime</code>, see <a
 * href="https://docs.aws.amazon.com/iotanalytics/latest/userguide/automate-create-dataset.html#automate-example6">
 * Creating a SQL dataset with a delta window (CLI)</a> in the <i>AWS IoT Analytics User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DeltaTimeSessionWindowConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeltaTimeSessionWindowConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A time interval. You can use <code>timeoutInMinutes</code> so that AWS IoT Analytics can batch up late data
     * notifications that have been generated since the last execution. AWS IoT Analytics sends one batch of
     * notifications to Amazon CloudWatch Events at one time.
     * </p>
     * <p>
     * For more information about how to write a timestamp expression, see <a
     * href="https://prestodb.io/docs/0.172/functions/datetime.html">Date and Time Functions and Operators</a>, in the
     * <i>Presto 0.172 Documentation</i>.
     * </p>
     */
    private Integer timeoutInMinutes;

    /**
     * <p>
     * A time interval. You can use <code>timeoutInMinutes</code> so that AWS IoT Analytics can batch up late data
     * notifications that have been generated since the last execution. AWS IoT Analytics sends one batch of
     * notifications to Amazon CloudWatch Events at one time.
     * </p>
     * <p>
     * For more information about how to write a timestamp expression, see <a
     * href="https://prestodb.io/docs/0.172/functions/datetime.html">Date and Time Functions and Operators</a>, in the
     * <i>Presto 0.172 Documentation</i>.
     * </p>
     * 
     * @param timeoutInMinutes
     *        A time interval. You can use <code>timeoutInMinutes</code> so that AWS IoT Analytics can batch up late
     *        data notifications that have been generated since the last execution. AWS IoT Analytics sends one batch of
     *        notifications to Amazon CloudWatch Events at one time.</p>
     *        <p>
     *        For more information about how to write a timestamp expression, see <a
     *        href="https://prestodb.io/docs/0.172/functions/datetime.html">Date and Time Functions and Operators</a>,
     *        in the <i>Presto 0.172 Documentation</i>.
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * A time interval. You can use <code>timeoutInMinutes</code> so that AWS IoT Analytics can batch up late data
     * notifications that have been generated since the last execution. AWS IoT Analytics sends one batch of
     * notifications to Amazon CloudWatch Events at one time.
     * </p>
     * <p>
     * For more information about how to write a timestamp expression, see <a
     * href="https://prestodb.io/docs/0.172/functions/datetime.html">Date and Time Functions and Operators</a>, in the
     * <i>Presto 0.172 Documentation</i>.
     * </p>
     * 
     * @return A time interval. You can use <code>timeoutInMinutes</code> so that AWS IoT Analytics can batch up late
     *         data notifications that have been generated since the last execution. AWS IoT Analytics sends one batch
     *         of notifications to Amazon CloudWatch Events at one time.</p>
     *         <p>
     *         For more information about how to write a timestamp expression, see <a
     *         href="https://prestodb.io/docs/0.172/functions/datetime.html">Date and Time Functions and Operators</a>,
     *         in the <i>Presto 0.172 Documentation</i>.
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * <p>
     * A time interval. You can use <code>timeoutInMinutes</code> so that AWS IoT Analytics can batch up late data
     * notifications that have been generated since the last execution. AWS IoT Analytics sends one batch of
     * notifications to Amazon CloudWatch Events at one time.
     * </p>
     * <p>
     * For more information about how to write a timestamp expression, see <a
     * href="https://prestodb.io/docs/0.172/functions/datetime.html">Date and Time Functions and Operators</a>, in the
     * <i>Presto 0.172 Documentation</i>.
     * </p>
     * 
     * @param timeoutInMinutes
     *        A time interval. You can use <code>timeoutInMinutes</code> so that AWS IoT Analytics can batch up late
     *        data notifications that have been generated since the last execution. AWS IoT Analytics sends one batch of
     *        notifications to Amazon CloudWatch Events at one time.</p>
     *        <p>
     *        For more information about how to write a timestamp expression, see <a
     *        href="https://prestodb.io/docs/0.172/functions/datetime.html">Date and Time Functions and Operators</a>,
     *        in the <i>Presto 0.172 Documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaTimeSessionWindowConfiguration withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
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
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: ").append(getTimeoutInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeltaTimeSessionWindowConfiguration == false)
            return false;
        DeltaTimeSessionWindowConfiguration other = (DeltaTimeSessionWindowConfiguration) obj;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public DeltaTimeSessionWindowConfiguration clone() {
        try {
            return (DeltaTimeSessionWindowConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DeltaTimeSessionWindowConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
