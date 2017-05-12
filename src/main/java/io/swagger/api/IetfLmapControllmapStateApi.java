package io.swagger.api;

import io.swagger.model.Action2;
import io.swagger.model.Action3;
import io.swagger.model.Agent2;
import io.swagger.model.Agent3;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.InlineResponse20011;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.InlineResponse20013;
import io.swagger.model.InlineResponse20014;
import io.swagger.model.InlineResponse20015;
import io.swagger.model.InlineResponse20016;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse2009SchedulesAction;
import io.swagger.model.InlineResponse2009SchedulesSchedule;
import io.swagger.model.InlineResponse2009SuppressionsSuppression;
import io.swagger.model.InlineResponse2009TasksTask;
import io.swagger.model.InlineResponse200TasksMetric;
import java.util.List;
import io.swagger.model.Lmapstate;
import io.swagger.model.Lmapstate1;
import io.swagger.model.Metric2;
import io.swagger.model.Metric3;
import io.swagger.model.Schedule2;
import io.swagger.model.Schedule3;
import io.swagger.model.Schedules2;
import io.swagger.model.Schedules3;
import io.swagger.model.Suppression2;
import io.swagger.model.Suppression3;
import io.swagger.model.Suppressions2;
import io.swagger.model.Suppressions3;
import io.swagger.model.Task2;
import io.swagger.model.Task3;
import io.swagger.model.Tasks2;
import io.swagger.model.Tasks3;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

@Api(value = "ietf-lmap-control:lmap-state", description = "the ietf-lmap-control:lmap-state API")
public interface IetfLmapControllmapStateApi {

    @ApiOperation(value = "Delete agent from lmap-state", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/agent",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapStateAgentDelete();


    @ApiOperation(value = "View detail on agent", notes = "Operations state of the measurement agent.", response = InlineResponse20010.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of agent", response = InlineResponse20010.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/agent",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20010> ietfLmapControllmapStateAgentGet();


    @ApiOperation(value = "Merge details on agent", notes = "", response = InlineResponse20010.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of agent", response = InlineResponse20010.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/agent",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse20010> ietfLmapControllmapStateAgentPatch(@ApiParam(value = "Operations state of the measurement agent."  ) @RequestBody Agent3 agent);


    @ApiOperation(value = "Update details on agent", notes = "", response = InlineResponse20010.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of agent", response = InlineResponse20010.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/agent",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20010> ietfLmapControllmapStateAgentPut(@ApiParam(value = "Operations state of the measurement agent."  ) @RequestBody Agent2 agent);


    @ApiOperation(value = "Delete lmap-state from ietf-lmap-control", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapStateDelete();


    @ApiOperation(value = "View detail on lmap-state", notes = "A tree exporting state information about the LMAP agent.", response = InlineResponse2009.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of lmap-state", response = InlineResponse2009.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2009> ietfLmapControllmapStateGet();


    @ApiOperation(value = "Merge details on lmap-state", notes = "", response = InlineResponse2009.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of lmap-state", response = InlineResponse2009.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2009> ietfLmapControllmapStatePatch(@ApiParam(value = "A tree exporting state information about the LMAP agent."  ) @RequestBody Lmapstate1 lmapState);


    @ApiOperation(value = "Update details on lmap-state", notes = "", response = InlineResponse2009.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of lmap-state", response = InlineResponse2009.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2009> ietfLmapControllmapStatePut(@ApiParam(value = "A tree exporting state information about the LMAP agent."  ) @RequestBody Lmapstate lmapState);


    @ApiOperation(value = "Delete schedules from lmap-state", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapStateSchedulesDelete();


    @ApiOperation(value = "View detail on schedules", notes = "State of LMAP schedules.", response = InlineResponse20012.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedules", response = InlineResponse20012.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20012> ietfLmapControllmapStateSchedulesGet();


    @ApiOperation(value = "Merge details on schedules", notes = "", response = InlineResponse20012.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedules", response = InlineResponse20012.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse20012> ietfLmapControllmapStateSchedulesPatch(@ApiParam(value = "State of LMAP schedules."  ) @RequestBody Schedules3 schedules);


    @ApiOperation(value = "Update details on schedules", notes = "", response = InlineResponse20012.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedules", response = InlineResponse20012.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20012> ietfLmapControllmapStateSchedulesPut(@ApiParam(value = "State of LMAP schedules."  ) @RequestBody Schedules2 schedules);


    @ApiOperation(value = "List all schedules from schedules", notes = "", response = InlineResponse2009SchedulesSchedule.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedules", response = InlineResponse2009SchedulesSchedule.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse2009SchedulesSchedule>> ietfLmapControllmapStateSchedulesScheduleGet();


    @ApiOperation(value = "Merge items into the schedule collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapStateSchedulesSchedulePatch(@ApiParam(value = "State of a particular schedule."  ) @RequestBody List<InlineResponse2009SchedulesSchedule> schedule);


    @ApiOperation(value = "Creates one or more new schedule in schedules", notes = "State of a particular schedule.", response = InlineResponse2009SchedulesSchedule.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating schedule(s) in collection", response = InlineResponse2009SchedulesSchedule.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse2009SchedulesSchedule>> ietfLmapControllmapStateSchedulesSchedulePost(@ApiParam(value = "State of a particular schedule."  ) @RequestBody List<InlineResponse2009SchedulesSchedule> schedule);


    @ApiOperation(value = "Replace the entire schedule collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapStateSchedulesSchedulePut(@ApiParam(value = "State of a particular schedule."  ) @RequestBody List<InlineResponse2009SchedulesSchedule> schedule);


    @ApiOperation(value = "List all actions from schedule", notes = "", response = InlineResponse2009SchedulesAction.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of actions", response = InlineResponse2009SchedulesAction.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}/action",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse2009SchedulesAction>> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionGet(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "Delete action from schedule", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}/action/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionNameDelete(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "View detail on action", notes = "The state of the actions associated with this schedule entry.", response = InlineResponse20014.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of action", response = InlineResponse20014.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}/action/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20014> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionNameGet(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "Merge details on action", notes = "", response = InlineResponse20014.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of action", response = InlineResponse20014.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}/action/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse20014> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionNamePatch(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "The state of the actions associated with this schedule entry."  ) @RequestBody Action3 action);


    @ApiOperation(value = "Update details on action", notes = "", response = InlineResponse20014.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of action", response = InlineResponse20014.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}/action/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20014> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionNamePut(@ApiParam(value = "The unique identifier for this action.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "The state of the actions associated with this schedule entry."  ) @RequestBody Action2 action);


    @ApiOperation(value = "Merge items into the action collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}/action",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionPatch(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "The state of the actions associated with this schedule entry."  ) @RequestBody List<InlineResponse2009SchedulesAction> action);


    @ApiOperation(value = "Creates one or more new action in schedule", notes = "The state of the actions associated with this schedule entry.", response = InlineResponse2009SchedulesAction.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating action(s) in collection", response = InlineResponse2009SchedulesAction.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}/action",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse2009SchedulesAction>> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionPost(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "The state of the actions associated with this schedule entry."  ) @RequestBody List<InlineResponse2009SchedulesAction> action);


    @ApiOperation(value = "Replace the entire action collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}/action",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapStateSchedulesScheduleScheduleNameActionPut(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "The state of the actions associated with this schedule entry."  ) @RequestBody List<InlineResponse2009SchedulesAction> action);


    @ApiOperation(value = "Delete schedule from schedules", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapStateSchedulesScheduleScheduleNameDelete(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "View detail on schedule", notes = "State of a particular schedule.", response = InlineResponse20013.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedule", response = InlineResponse20013.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20013> ietfLmapControllmapStateSchedulesScheduleScheduleNameGet(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName);


    @ApiOperation(value = "Merge details on schedule", notes = "", response = InlineResponse20013.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedule", response = InlineResponse20013.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse20013> ietfLmapControllmapStateSchedulesScheduleScheduleNamePatch(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "State of a particular schedule."  ) @RequestBody Schedule3 schedule);


    @ApiOperation(value = "Update details on schedule", notes = "", response = InlineResponse20013.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of schedule", response = InlineResponse20013.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/schedules/schedule/{schedule-name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20013> ietfLmapControllmapStateSchedulesScheduleScheduleNamePut(@ApiParam(value = "The locally-unique, administratively assigned name for this schedule.",required=true ) @PathVariable("scheduleName") String scheduleName,
        @ApiParam(value = "State of a particular schedule."  ) @RequestBody Schedule2 schedule);


    @ApiOperation(value = "Delete suppressions from lmap-state", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapStateSuppressionsDelete();


    @ApiOperation(value = "View detail on suppressions", notes = "State of LMAP suppressions.", response = InlineResponse20015.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppressions", response = InlineResponse20015.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20015> ietfLmapControllmapStateSuppressionsGet();


    @ApiOperation(value = "Merge details on suppressions", notes = "", response = InlineResponse20015.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppressions", response = InlineResponse20015.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse20015> ietfLmapControllmapStateSuppressionsPatch(@ApiParam(value = "State of LMAP suppressions."  ) @RequestBody Suppressions3 suppressions);


    @ApiOperation(value = "Update details on suppressions", notes = "", response = InlineResponse20015.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppressions", response = InlineResponse20015.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20015> ietfLmapControllmapStateSuppressionsPut(@ApiParam(value = "State of LMAP suppressions."  ) @RequestBody Suppressions2 suppressions);


    @ApiOperation(value = "List all suppressions from suppressions", notes = "", response = InlineResponse2009SuppressionsSuppression.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppressions", response = InlineResponse2009SuppressionsSuppression.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions/suppression",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse2009SuppressionsSuppression>> ietfLmapControllmapStateSuppressionsSuppressionGet();


    @ApiOperation(value = "Delete suppression from suppressions", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions/suppression/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapStateSuppressionsSuppressionNameDelete(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "View detail on suppression", notes = "State of a particular suppression.", response = InlineResponse20016.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppression", response = InlineResponse20016.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions/suppression/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20016> ietfLmapControllmapStateSuppressionsSuppressionNameGet(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "Merge details on suppression", notes = "", response = InlineResponse20016.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppression", response = InlineResponse20016.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions/suppression/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse20016> ietfLmapControllmapStateSuppressionsSuppressionNamePatch(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "State of a particular suppression."  ) @RequestBody Suppression3 suppression);


    @ApiOperation(value = "Update details on suppression", notes = "", response = InlineResponse20016.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of suppression", response = InlineResponse20016.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions/suppression/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20016> ietfLmapControllmapStateSuppressionsSuppressionNamePut(@ApiParam(value = "The locally-unique, administratively assigned name for this suppression.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "State of a particular suppression."  ) @RequestBody Suppression2 suppression);


    @ApiOperation(value = "Merge items into the suppression collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions/suppression",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapStateSuppressionsSuppressionPatch(@ApiParam(value = "State of a particular suppression."  ) @RequestBody List<InlineResponse2009SuppressionsSuppression> suppression);


    @ApiOperation(value = "Creates one or more new suppression in suppressions", notes = "State of a particular suppression.", response = InlineResponse2009SuppressionsSuppression.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating suppression(s) in collection", response = InlineResponse2009SuppressionsSuppression.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions/suppression",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse2009SuppressionsSuppression>> ietfLmapControllmapStateSuppressionsSuppressionPost(@ApiParam(value = "State of a particular suppression."  ) @RequestBody List<InlineResponse2009SuppressionsSuppression> suppression);


    @ApiOperation(value = "Replace the entire suppression collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/suppressions/suppression",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapStateSuppressionsSuppressionPut(@ApiParam(value = "State of a particular suppression."  ) @RequestBody List<InlineResponse2009SuppressionsSuppression> suppression);


    @ApiOperation(value = "Delete tasks from lmap-state", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapStateTasksDelete();


    @ApiOperation(value = "View detail on tasks", notes = "Available LMAP tasks, including information about their last execution and their last failed execution.", response = InlineResponse20011.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of tasks", response = InlineResponse20011.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse20011> ietfLmapControllmapStateTasksGet();


    @ApiOperation(value = "Merge details on tasks", notes = "", response = InlineResponse20011.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of tasks", response = InlineResponse20011.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse20011> ietfLmapControllmapStateTasksPatch(@ApiParam(value = "Available LMAP tasks, including information about their last execution and their last failed execution."  ) @RequestBody Tasks3 tasks);


    @ApiOperation(value = "Update details on tasks", notes = "", response = InlineResponse20011.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of tasks", response = InlineResponse20011.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse20011> ietfLmapControllmapStateTasksPut(@ApiParam(value = "Available LMAP tasks, including information about their last execution and their last failed execution."  ) @RequestBody Tasks2 tasks);


    @ApiOperation(value = "List all tasks from tasks", notes = "", response = InlineResponse2009TasksTask.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of tasks", response = InlineResponse2009TasksTask.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse2009TasksTask>> ietfLmapControllmapStateTasksTaskGet();


    @ApiOperation(value = "Delete task from tasks", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapStateTasksTaskNameDelete(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "View detail on task", notes = "The list of tasks available on the LMAP agent.", response = InlineResponse2009TasksTask.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of task", response = InlineResponse2009TasksTask.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2009TasksTask> ietfLmapControllmapStateTasksTaskNameGet(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "List all metrics from metrics-grouping", notes = "", response = InlineResponse200TasksMetric.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of metrics", response = InlineResponse200TasksMetric.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}/metric",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<InlineResponse200TasksMetric>> ietfLmapControllmapStateTasksTaskNameMetricGet(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "Merge items into the metric collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}/metric",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapStateTasksTaskNameMetricPatch(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric);


    @ApiOperation(value = "Creates one or more new metric in metrics-grouping", notes = "A list of entries in a metrics registry.", response = InlineResponse200TasksMetric.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating metric(s) in collection", response = InlineResponse200TasksMetric.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}/metric",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse200TasksMetric>> ietfLmapControllmapStateTasksTaskNameMetricPost(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric);


    @ApiOperation(value = "Replace the entire metric collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}/metric",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapStateTasksTaskNameMetricPut(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody List<InlineResponse200TasksMetric> metric);


    @ApiOperation(value = "Delete metric from metrics-grouping", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Expected response for delete", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}/metric/{uri}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ietfLmapControllmapStateTasksTaskNameMetricUriDelete(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "View detail on metric", notes = "A list of entries in a metrics registry.", response = InlineResponse2003.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of metric", response = InlineResponse2003.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}/metric/{uri}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2003> ietfLmapControllmapStateTasksTaskNameMetricUriGet(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name);


    @ApiOperation(value = "Merge details on metric", notes = "", response = InlineResponse2003.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of metric", response = InlineResponse2003.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}/metric/{uri}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2003> ietfLmapControllmapStateTasksTaskNameMetricUriPatch(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody Metric3 metric);


    @ApiOperation(value = "Update details on metric", notes = "", response = InlineResponse2003.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of metric", response = InlineResponse2003.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}/metric/{uri}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2003> ietfLmapControllmapStateTasksTaskNameMetricUriPut(@ApiParam(value = "A URI identifying an entry in a metrics registry.",required=true ) @PathVariable("uri") String uri,
        @ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "A list of entries in a metrics registry."  ) @RequestBody Metric2 metric);


    @ApiOperation(value = "Merge details on task", notes = "", response = InlineResponse2009TasksTask.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of task", response = InlineResponse2009TasksTask.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<InlineResponse2009TasksTask> ietfLmapControllmapStateTasksTaskNamePatch(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of tasks available on the LMAP agent."  ) @RequestBody Task3 task);


    @ApiOperation(value = "Update details on task", notes = "", response = InlineResponse2009TasksTask.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response of task", response = InlineResponse2009TasksTask.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task/{name}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse2009TasksTask> ietfLmapControllmapStateTasksTaskNamePut(@ApiParam(value = "The unique name of a task.",required=true ) @PathVariable("name") String name,
        @ApiParam(value = "The list of tasks available on the LMAP agent."  ) @RequestBody Task2 task);


    @ApiOperation(value = "Merge items into the task collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for merging into collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Void> ietfLmapControllmapStateTasksTaskPatch(@ApiParam(value = "The list of tasks available on the LMAP agent."  ) @RequestBody List<InlineResponse2009TasksTask> task);


    @ApiOperation(value = "Creates one or more new task in tasks", notes = "The list of tasks available on the LMAP agent.", response = InlineResponse2009TasksTask.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response for creating task(s) in collection", response = InlineResponse2009TasksTask.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<List<InlineResponse2009TasksTask>> ietfLmapControllmapStateTasksTaskPost(@ApiParam(value = "The list of tasks available on the LMAP agent."  ) @RequestBody List<InlineResponse2009TasksTask> task);


    @ApiOperation(value = "Replace the entire task collection", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Expected response for replacing collection", response = Void.class) })
    @RequestMapping(value = "/ietf-lmap-control:lmap-state/tasks/task",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> ietfLmapControllmapStateTasksTaskPut(@ApiParam(value = "The list of tasks available on the LMAP agent."  ) @RequestBody List<InlineResponse2009TasksTask> task);

}
