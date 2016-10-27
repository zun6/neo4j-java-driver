/**
 * Copyright (c) 2002-2016 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.neo4j.driver.v1;

/**
 * Encapsulates details of retry logic for operations that can be retried after failure.
 */
public class RetryLogic
{
    public static final RetryLogic TRY_UP_TO_3_TIMES_WITH_5_SECOND_PAUSE = new RetryLogic( 3, 5_000 );
    public static final RetryLogic DEFAULT_RETRY_LOGIC = TRY_UP_TO_3_TIMES_WITH_5_SECOND_PAUSE;

    private final int attempts;
    private final int pause;

    public RetryLogic( int attempts, int pause )
    {
        this.attempts = attempts;
        this.pause = pause;
    }

    public int attempts()
    {
        return attempts;
    }

    public int pause()
    {
        return pause;
    }
}
