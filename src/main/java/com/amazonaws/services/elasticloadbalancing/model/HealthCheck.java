/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;


/**
 * <p>
 * The HealthCheck data type.
 * </p>
 */
public class HealthCheck implements Serializable {

    /**
     * Specifies the instance being checked. The protocol is either TCP,
     * HTTP, HTTPS, or SSL. The range of valid ports is one (1) through
     * 65535. <note> <p> TCP is the default, specified as a TCP: port pair,
     * for example "TCP:5000". In this case a healthcheck simply attempts to
     * open a TCP connection to the instance on the specified port. Failure
     * to connect within the configured timeout is considered unhealthy.
     * <p>SSL is also specified as SSL: port pair, for example, SSL:5000. <p>
     * For HTTP or HTTPS protocol, the situation is different. You have to
     * include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy. <p>
     * The total length of the HTTP ping target needs to be 1024 16-bit
     * Unicode characters or less. </note>
     */
    private String target;

    /**
     * Specifies the approximate interval, in seconds, between health checks
     * of an individual instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     */
    private Integer interval;

    /**
     * Specifies the amount of time, in seconds, during which no response
     * means a failed health probe. <note> This value must be less than the
     * <i>Interval</i> value. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     */
    private Integer timeout;

    /**
     * Specifies the number of consecutive health probe failures required
     * before moving the instance to the <i>Unhealthy</i> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     */
    private Integer unhealthyThreshold;

    /**
     * Specifies the number of consecutive health probe successes required
     * before moving the instance to the <i>Healthy</i> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     */
    private Integer healthyThreshold;

    /**
     * Default constructor for a new HealthCheck object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public HealthCheck() {}
    
    /**
     * Constructs a new HealthCheck object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param target Specifies the instance being checked. The protocol is
     * either TCP, HTTP, HTTPS, or SSL. The range of valid ports is one (1)
     * through 65535. <note> <p> TCP is the default, specified as a TCP: port
     * pair, for example "TCP:5000". In this case a healthcheck simply
     * attempts to open a TCP connection to the instance on the specified
     * port. Failure to connect within the configured timeout is considered
     * unhealthy. <p>SSL is also specified as SSL: port pair, for example,
     * SSL:5000. <p> For HTTP or HTTPS protocol, the situation is different.
     * You have to include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy. <p>
     * The total length of the HTTP ping target needs to be 1024 16-bit
     * Unicode characters or less. </note>
     * @param interval Specifies the approximate interval, in seconds,
     * between health checks of an individual instance.
     * @param timeout Specifies the amount of time, in seconds, during which
     * no response means a failed health probe. <note> This value must be
     * less than the <i>Interval</i> value. </note>
     * @param unhealthyThreshold Specifies the number of consecutive health
     * probe failures required before moving the instance to the
     * <i>Unhealthy</i> state.
     * @param healthyThreshold Specifies the number of consecutive health
     * probe successes required before moving the instance to the
     * <i>Healthy</i> state.
     */
    public HealthCheck(String target, Integer interval, Integer timeout, Integer unhealthyThreshold, Integer healthyThreshold) {
        setTarget(target);
        setInterval(interval);
        setTimeout(timeout);
        setUnhealthyThreshold(unhealthyThreshold);
        setHealthyThreshold(healthyThreshold);
    }

    /**
     * Specifies the instance being checked. The protocol is either TCP,
     * HTTP, HTTPS, or SSL. The range of valid ports is one (1) through
     * 65535. <note> <p> TCP is the default, specified as a TCP: port pair,
     * for example "TCP:5000". In this case a healthcheck simply attempts to
     * open a TCP connection to the instance on the specified port. Failure
     * to connect within the configured timeout is considered unhealthy.
     * <p>SSL is also specified as SSL: port pair, for example, SSL:5000. <p>
     * For HTTP or HTTPS protocol, the situation is different. You have to
     * include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy. <p>
     * The total length of the HTTP ping target needs to be 1024 16-bit
     * Unicode characters or less. </note>
     *
     * @return Specifies the instance being checked. The protocol is either TCP,
     *         HTTP, HTTPS, or SSL. The range of valid ports is one (1) through
     *         65535. <note> <p> TCP is the default, specified as a TCP: port pair,
     *         for example "TCP:5000". In this case a healthcheck simply attempts to
     *         open a TCP connection to the instance on the specified port. Failure
     *         to connect within the configured timeout is considered unhealthy.
     *         <p>SSL is also specified as SSL: port pair, for example, SSL:5000. <p>
     *         For HTTP or HTTPS protocol, the situation is different. You have to
     *         include a ping path in the string. HTTP is specified as a
     *         HTTP:port;/;PathToPing; grouping, for example
     *         "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     *         issued to the instance on the given port and path. Any answer other
     *         than "200 OK" within the timeout period is considered unhealthy. <p>
     *         The total length of the HTTP ping target needs to be 1024 16-bit
     *         Unicode characters or less. </note>
     */
    public String getTarget() {
        return target;
    }
    
    /**
     * Specifies the instance being checked. The protocol is either TCP,
     * HTTP, HTTPS, or SSL. The range of valid ports is one (1) through
     * 65535. <note> <p> TCP is the default, specified as a TCP: port pair,
     * for example "TCP:5000". In this case a healthcheck simply attempts to
     * open a TCP connection to the instance on the specified port. Failure
     * to connect within the configured timeout is considered unhealthy.
     * <p>SSL is also specified as SSL: port pair, for example, SSL:5000. <p>
     * For HTTP or HTTPS protocol, the situation is different. You have to
     * include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy. <p>
     * The total length of the HTTP ping target needs to be 1024 16-bit
     * Unicode characters or less. </note>
     *
     * @param target Specifies the instance being checked. The protocol is either TCP,
     *         HTTP, HTTPS, or SSL. The range of valid ports is one (1) through
     *         65535. <note> <p> TCP is the default, specified as a TCP: port pair,
     *         for example "TCP:5000". In this case a healthcheck simply attempts to
     *         open a TCP connection to the instance on the specified port. Failure
     *         to connect within the configured timeout is considered unhealthy.
     *         <p>SSL is also specified as SSL: port pair, for example, SSL:5000. <p>
     *         For HTTP or HTTPS protocol, the situation is different. You have to
     *         include a ping path in the string. HTTP is specified as a
     *         HTTP:port;/;PathToPing; grouping, for example
     *         "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     *         issued to the instance on the given port and path. Any answer other
     *         than "200 OK" within the timeout period is considered unhealthy. <p>
     *         The total length of the HTTP ping target needs to be 1024 16-bit
     *         Unicode characters or less. </note>
     */
    public void setTarget(String target) {
        this.target = target;
    }
    
    /**
     * Specifies the instance being checked. The protocol is either TCP,
     * HTTP, HTTPS, or SSL. The range of valid ports is one (1) through
     * 65535. <note> <p> TCP is the default, specified as a TCP: port pair,
     * for example "TCP:5000". In this case a healthcheck simply attempts to
     * open a TCP connection to the instance on the specified port. Failure
     * to connect within the configured timeout is considered unhealthy.
     * <p>SSL is also specified as SSL: port pair, for example, SSL:5000. <p>
     * For HTTP or HTTPS protocol, the situation is different. You have to
     * include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other
     * than "200 OK" within the timeout period is considered unhealthy. <p>
     * The total length of the HTTP ping target needs to be 1024 16-bit
     * Unicode characters or less. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param target Specifies the instance being checked. The protocol is either TCP,
     *         HTTP, HTTPS, or SSL. The range of valid ports is one (1) through
     *         65535. <note> <p> TCP is the default, specified as a TCP: port pair,
     *         for example "TCP:5000". In this case a healthcheck simply attempts to
     *         open a TCP connection to the instance on the specified port. Failure
     *         to connect within the configured timeout is considered unhealthy.
     *         <p>SSL is also specified as SSL: port pair, for example, SSL:5000. <p>
     *         For HTTP or HTTPS protocol, the situation is different. You have to
     *         include a ping path in the string. HTTP is specified as a
     *         HTTP:port;/;PathToPing; grouping, for example
     *         "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     *         issued to the instance on the given port and path. Any answer other
     *         than "200 OK" within the timeout period is considered unhealthy. <p>
     *         The total length of the HTTP ping target needs to be 1024 16-bit
     *         Unicode characters or less. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheck withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Specifies the approximate interval, in seconds, between health checks
     * of an individual instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @return Specifies the approximate interval, in seconds, between health checks
     *         of an individual instance.
     */
    public Integer getInterval() {
        return interval;
    }
    
    /**
     * Specifies the approximate interval, in seconds, between health checks
     * of an individual instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param interval Specifies the approximate interval, in seconds, between health checks
     *         of an individual instance.
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }
    
    /**
     * Specifies the approximate interval, in seconds, between health checks
     * of an individual instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param interval Specifies the approximate interval, in seconds, between health checks
     *         of an individual instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheck withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Specifies the amount of time, in seconds, during which no response
     * means a failed health probe. <note> This value must be less than the
     * <i>Interval</i> value. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @return Specifies the amount of time, in seconds, during which no response
     *         means a failed health probe. <note> This value must be less than the
     *         <i>Interval</i> value. </note>
     */
    public Integer getTimeout() {
        return timeout;
    }
    
    /**
     * Specifies the amount of time, in seconds, during which no response
     * means a failed health probe. <note> This value must be less than the
     * <i>Interval</i> value. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param timeout Specifies the amount of time, in seconds, during which no response
     *         means a failed health probe. <note> This value must be less than the
     *         <i>Interval</i> value. </note>
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
    
    /**
     * Specifies the amount of time, in seconds, during which no response
     * means a failed health probe. <note> This value must be less than the
     * <i>Interval</i> value. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 300<br/>
     *
     * @param timeout Specifies the amount of time, in seconds, during which no response
     *         means a failed health probe. <note> This value must be less than the
     *         <i>Interval</i> value. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheck withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Specifies the number of consecutive health probe failures required
     * before moving the instance to the <i>Unhealthy</i> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return Specifies the number of consecutive health probe failures required
     *         before moving the instance to the <i>Unhealthy</i> state.
     */
    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }
    
    /**
     * Specifies the number of consecutive health probe failures required
     * before moving the instance to the <i>Unhealthy</i> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param unhealthyThreshold Specifies the number of consecutive health probe failures required
     *         before moving the instance to the <i>Unhealthy</i> state.
     */
    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }
    
    /**
     * Specifies the number of consecutive health probe failures required
     * before moving the instance to the <i>Unhealthy</i> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param unhealthyThreshold Specifies the number of consecutive health probe failures required
     *         before moving the instance to the <i>Unhealthy</i> state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheck withUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    /**
     * Specifies the number of consecutive health probe successes required
     * before moving the instance to the <i>Healthy</i> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return Specifies the number of consecutive health probe successes required
     *         before moving the instance to the <i>Healthy</i> state.
     */
    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }
    
    /**
     * Specifies the number of consecutive health probe successes required
     * before moving the instance to the <i>Healthy</i> state.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param healthyThreshold Specifies the number of consecutive health probe successes required
     *         before moving the instance to the <i>Healthy</i> state.
     */
    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }
    
    /**
     * Specifies the number of consecutive health probe successes required
     * before moving the instance to the <i>Healthy</i> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param healthyThreshold Specifies the number of consecutive health probe successes required
     *         before moving the instance to the <i>Healthy</i> state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheck withHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTarget() != null) sb.append("Target: " + getTarget() + ",");
        if (getInterval() != null) sb.append("Interval: " + getInterval() + ",");
        if (getTimeout() != null) sb.append("Timeout: " + getTimeout() + ",");
        if (getUnhealthyThreshold() != null) sb.append("UnhealthyThreshold: " + getUnhealthyThreshold() + ",");
        if (getHealthyThreshold() != null) sb.append("HealthyThreshold: " + getHealthyThreshold() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode()); 
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode()); 
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getUnhealthyThreshold() == null) ? 0 : getUnhealthyThreshold().hashCode()); 
        hashCode = prime * hashCode + ((getHealthyThreshold() == null) ? 0 : getHealthyThreshold().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HealthCheck == false) return false;
        HealthCheck other = (HealthCheck)obj;
        
        if (other.getTarget() == null ^ this.getTarget() == null) return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false) return false; 
        if (other.getInterval() == null ^ this.getInterval() == null) return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false) return false; 
        if (other.getTimeout() == null ^ this.getTimeout() == null) return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false) return false; 
        if (other.getUnhealthyThreshold() == null ^ this.getUnhealthyThreshold() == null) return false;
        if (other.getUnhealthyThreshold() != null && other.getUnhealthyThreshold().equals(this.getUnhealthyThreshold()) == false) return false; 
        if (other.getHealthyThreshold() == null ^ this.getHealthyThreshold() == null) return false;
        if (other.getHealthyThreshold() != null && other.getHealthyThreshold().equals(this.getHealthyThreshold()) == false) return false; 
        return true;
    }
    
}
    