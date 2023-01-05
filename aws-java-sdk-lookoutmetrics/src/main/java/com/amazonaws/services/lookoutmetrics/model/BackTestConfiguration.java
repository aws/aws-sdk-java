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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings for backtest mode.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/BackTestConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackTestConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Run a backtest instead of monitoring new data.
     * </p>
     */
    private Boolean runBackTestMode;

    /**
     * <p>
     * Run a backtest instead of monitoring new data.
     * </p>
     * 
     * @param runBackTestMode
     *        Run a backtest instead of monitoring new data.
     */

    public void setRunBackTestMode(Boolean runBackTestMode) {
        this.runBackTestMode = runBackTestMode;
    }

    /**
     * <p>
     * Run a backtest instead of monitoring new data.
     * </p>
     * 
     * @return Run a backtest instead of monitoring new data.
     */

    public Boolean getRunBackTestMode() {
        return this.runBackTestMode;
    }

    /**
     * <p>
     * Run a backtest instead of monitoring new data.
     * </p>
     * 
     * @param runBackTestMode
     *        Run a backtest instead of monitoring new data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackTestConfiguration withRunBackTestMode(Boolean runBackTestMode) {
        setRunBackTestMode(runBackTestMode);
        return this;
    }

    /**
     * <p>
     * Run a backtest instead of monitoring new data.
     * </p>
     * 
     * @return Run a backtest instead of monitoring new data.
     */

    public Boolean isRunBackTestMode() {
        return this.runBackTestMode;
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
        if (getRunBackTestMode() != null)
            sb.append("RunBackTestMode: ").append(getRunBackTestMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackTestConfiguration == false)
            return false;
        BackTestConfiguration other = (BackTestConfiguration) obj;
        if (other.getRunBackTestMode() == null ^ this.getRunBackTestMode() == null)
            return false;
        if (other.getRunBackTestMode() != null && other.getRunBackTestMode().equals(this.getRunBackTestMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunBackTestMode() == null) ? 0 : getRunBackTestMode().hashCode());
        return hashCode;
    }

    @Override
    public BackTestConfiguration clone() {
        try {
            return (BackTestConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.BackTestConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
