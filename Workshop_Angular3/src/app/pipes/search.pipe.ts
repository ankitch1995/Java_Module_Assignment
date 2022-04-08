import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(value: any[], args: string): any {
   // if(!value) return null;
   //if(!args) return value;
    let search = args.toLowerCase();
    return value.filter(employee => {
      let employeeName = employee.name.toLowerCase();
      return employeeName.indexOf(search) !== -1;});
  }

}
