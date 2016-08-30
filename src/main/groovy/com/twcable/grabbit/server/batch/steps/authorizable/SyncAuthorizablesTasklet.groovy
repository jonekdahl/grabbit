package com.twcable.grabbit.server.batch.steps.authorizable

import org.springframework.batch.core.StepContribution
import org.springframework.batch.core.scope.context.ChunkContext
import org.springframework.batch.core.step.tasklet.Tasklet
import org.springframework.batch.repeat.RepeatStatus

/*
 * Copyright 2015 Time Warner Cable, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class SyncAuthorizablesTasklet implements Tasklet {

    /**
     * Given the current context in the form of a step contribution, do whatever
     * is necessary to process this unit inside a transaction. Implementations
     * return {@link RepeatStatus#FINISHED} if finished. If not they return
     * {@link RepeatStatus#CONTINUABLE}. On failure throws an exception.
     *
     * @param contribution mutable state to be passed back to update the current
     * step execution
     * @param chunkContext attributes shared between invocations but not between
     * restarts
     * @return an {@link RepeatStatus} indicating whether processing is
     * continuable.
     */
    @Override
    RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        return null
    }
}
