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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the average latency for the slowest X percent of requests over the last 10 seconds.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/Latency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Latency implements Serializable, Cloneable {

    /**
     * <p>
     * The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
     * </p>
     */
    private Double p999;
    /**
     * <p>
     * The average latency for the slowest 1 percent of requests over the last 10 seconds.
     * </p>
     */
    private Double p99;
    /**
     * <p>
     * The average latency for the slowest 5 percent of requests over the last 10 seconds.
     * </p>
     */
    private Double p95;
    /**
     * <p>
     * The average latency for the slowest 10 percent of requests over the last 10 seconds.
     * </p>
     */
    private Double p90;
    /**
     * <p>
     * The average latency for the slowest 15 percent of requests over the last 10 seconds.
     * </p>
     */
    private Double p85;
    /**
     * <p>
     * The average latency for the slowest 25 percent of requests over the last 10 seconds.
     * </p>
     */
    private Double p75;
    /**
     * <p>
     * The average latency for the slowest 50 percent of requests over the last 10 seconds.
     * </p>
     */
    private Double p50;
    /**
     * <p>
     * The average latency for the slowest 90 percent of requests over the last 10 seconds.
     * </p>
     */
    private Double p10;

    /**
     * <p>
     * The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p999
     *        The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
     */

    public void setP999(Double p999) {
        this.p999 = p999;
    }

    /**
     * <p>
     * The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @return The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
     */

    public Double getP999() {
        return this.p999;
    }

    /**
     * <p>
     * The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p999
     *        The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withP999(Double p999) {
        setP999(p999);
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 1 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p99
     *        The average latency for the slowest 1 percent of requests over the last 10 seconds.
     */

    public void setP99(Double p99) {
        this.p99 = p99;
    }

    /**
     * <p>
     * The average latency for the slowest 1 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @return The average latency for the slowest 1 percent of requests over the last 10 seconds.
     */

    public Double getP99() {
        return this.p99;
    }

    /**
     * <p>
     * The average latency for the slowest 1 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p99
     *        The average latency for the slowest 1 percent of requests over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withP99(Double p99) {
        setP99(p99);
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 5 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p95
     *        The average latency for the slowest 5 percent of requests over the last 10 seconds.
     */

    public void setP95(Double p95) {
        this.p95 = p95;
    }

    /**
     * <p>
     * The average latency for the slowest 5 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @return The average latency for the slowest 5 percent of requests over the last 10 seconds.
     */

    public Double getP95() {
        return this.p95;
    }

    /**
     * <p>
     * The average latency for the slowest 5 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p95
     *        The average latency for the slowest 5 percent of requests over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withP95(Double p95) {
        setP95(p95);
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 10 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p90
     *        The average latency for the slowest 10 percent of requests over the last 10 seconds.
     */

    public void setP90(Double p90) {
        this.p90 = p90;
    }

    /**
     * <p>
     * The average latency for the slowest 10 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @return The average latency for the slowest 10 percent of requests over the last 10 seconds.
     */

    public Double getP90() {
        return this.p90;
    }

    /**
     * <p>
     * The average latency for the slowest 10 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p90
     *        The average latency for the slowest 10 percent of requests over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withP90(Double p90) {
        setP90(p90);
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 15 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p85
     *        The average latency for the slowest 15 percent of requests over the last 10 seconds.
     */

    public void setP85(Double p85) {
        this.p85 = p85;
    }

    /**
     * <p>
     * The average latency for the slowest 15 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @return The average latency for the slowest 15 percent of requests over the last 10 seconds.
     */

    public Double getP85() {
        return this.p85;
    }

    /**
     * <p>
     * The average latency for the slowest 15 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p85
     *        The average latency for the slowest 15 percent of requests over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withP85(Double p85) {
        setP85(p85);
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 25 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p75
     *        The average latency for the slowest 25 percent of requests over the last 10 seconds.
     */

    public void setP75(Double p75) {
        this.p75 = p75;
    }

    /**
     * <p>
     * The average latency for the slowest 25 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @return The average latency for the slowest 25 percent of requests over the last 10 seconds.
     */

    public Double getP75() {
        return this.p75;
    }

    /**
     * <p>
     * The average latency for the slowest 25 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p75
     *        The average latency for the slowest 25 percent of requests over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withP75(Double p75) {
        setP75(p75);
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 50 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p50
     *        The average latency for the slowest 50 percent of requests over the last 10 seconds.
     */

    public void setP50(Double p50) {
        this.p50 = p50;
    }

    /**
     * <p>
     * The average latency for the slowest 50 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @return The average latency for the slowest 50 percent of requests over the last 10 seconds.
     */

    public Double getP50() {
        return this.p50;
    }

    /**
     * <p>
     * The average latency for the slowest 50 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p50
     *        The average latency for the slowest 50 percent of requests over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withP50(Double p50) {
        setP50(p50);
        return this;
    }

    /**
     * <p>
     * The average latency for the slowest 90 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p10
     *        The average latency for the slowest 90 percent of requests over the last 10 seconds.
     */

    public void setP10(Double p10) {
        this.p10 = p10;
    }

    /**
     * <p>
     * The average latency for the slowest 90 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @return The average latency for the slowest 90 percent of requests over the last 10 seconds.
     */

    public Double getP10() {
        return this.p10;
    }

    /**
     * <p>
     * The average latency for the slowest 90 percent of requests over the last 10 seconds.
     * </p>
     * 
     * @param p10
     *        The average latency for the slowest 90 percent of requests over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Latency withP10(Double p10) {
        setP10(p10);
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
        if (getP999() != null)
            sb.append("P999: ").append(getP999()).append(",");
        if (getP99() != null)
            sb.append("P99: ").append(getP99()).append(",");
        if (getP95() != null)
            sb.append("P95: ").append(getP95()).append(",");
        if (getP90() != null)
            sb.append("P90: ").append(getP90()).append(",");
        if (getP85() != null)
            sb.append("P85: ").append(getP85()).append(",");
        if (getP75() != null)
            sb.append("P75: ").append(getP75()).append(",");
        if (getP50() != null)
            sb.append("P50: ").append(getP50()).append(",");
        if (getP10() != null)
            sb.append("P10: ").append(getP10());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Latency == false)
            return false;
        Latency other = (Latency) obj;
        if (other.getP999() == null ^ this.getP999() == null)
            return false;
        if (other.getP999() != null && other.getP999().equals(this.getP999()) == false)
            return false;
        if (other.getP99() == null ^ this.getP99() == null)
            return false;
        if (other.getP99() != null && other.getP99().equals(this.getP99()) == false)
            return false;
        if (other.getP95() == null ^ this.getP95() == null)
            return false;
        if (other.getP95() != null && other.getP95().equals(this.getP95()) == false)
            return false;
        if (other.getP90() == null ^ this.getP90() == null)
            return false;
        if (other.getP90() != null && other.getP90().equals(this.getP90()) == false)
            return false;
        if (other.getP85() == null ^ this.getP85() == null)
            return false;
        if (other.getP85() != null && other.getP85().equals(this.getP85()) == false)
            return false;
        if (other.getP75() == null ^ this.getP75() == null)
            return false;
        if (other.getP75() != null && other.getP75().equals(this.getP75()) == false)
            return false;
        if (other.getP50() == null ^ this.getP50() == null)
            return false;
        if (other.getP50() != null && other.getP50().equals(this.getP50()) == false)
            return false;
        if (other.getP10() == null ^ this.getP10() == null)
            return false;
        if (other.getP10() != null && other.getP10().equals(this.getP10()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getP999() == null) ? 0 : getP999().hashCode());
        hashCode = prime * hashCode + ((getP99() == null) ? 0 : getP99().hashCode());
        hashCode = prime * hashCode + ((getP95() == null) ? 0 : getP95().hashCode());
        hashCode = prime * hashCode + ((getP90() == null) ? 0 : getP90().hashCode());
        hashCode = prime * hashCode + ((getP85() == null) ? 0 : getP85().hashCode());
        hashCode = prime * hashCode + ((getP75() == null) ? 0 : getP75().hashCode());
        hashCode = prime * hashCode + ((getP50() == null) ? 0 : getP50().hashCode());
        hashCode = prime * hashCode + ((getP10() == null) ? 0 : getP10().hashCode());
        return hashCode;
    }

    @Override
    public Latency clone() {
        try {
            return (Latency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
