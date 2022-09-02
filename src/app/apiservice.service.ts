import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
const baseUrl = 'http://localhost:8085/api/mapping';
@Injectable({
  
  providedIn: 'root'
})
export class ApiserviceService {
  

  constructor(private http:HttpClient) { }

  //connect frontend to backend


  //create

  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }

  generatexml(id:any){

    this.http.get('http://localhost:8085/api/getmapping/'+id, {responseType: 'blob'}).subscribe(x => {
    
      var newBlob = new Blob([x], {type: 'application/xml'});
      const data = window.URL.createObjectURL(newBlob);

      var link = document.createElement('a');
      link.href = data;
      link.download = 'xml';
      link.dispatchEvent(new MouseEvent('click', {bubbles: true, cancelable: true, view: window}));

      setTimeout(function() {
          window.URL.revokeObjectURL(data);
          link.remove();
      }, 100);
  });
}






  

}
