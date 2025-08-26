import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Poll} from './poll.models';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PollService {
  private baseUrl: string = "http://localhost:8080/api/polls";

  constructor(private httpClient: HttpClient) { }

  createPoll(poll: Poll): Observable<Poll> {
    return this.httpClient.post<Poll>(this.baseUrl, poll);
  }

  getPolls(): Observable<Poll[]> {
    return this.httpClient.get<Poll[]>(this.baseUrl);
  }

  // vote(pollId: number, optionIndex: number): Observable<void> {
  //   const url = `${this.baseUrl}/vote`;
  //   return this.httpClient.post(url, {pollId,optionIndex});
  // }
}
